/*
 * Copyright (C) 2018 The P&W Songs Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.alelk.pws.android.app.fragment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuBuilder
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dagger.hilt.android.AndroidEntryPoint
import io.github.alelk.pws.android.app.R
import io.github.alelk.pws.android.app.activity.SongActivity
import io.github.alelk.pws.android.app.adapter.FavoritesRecyclerViewAdapter
import io.github.alelk.pws.android.app.model.FavoritesViewModel
import io.github.alelk.pws.database.dao.Favorite
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Favorites Fragment
 *
 * Created by Alex Elkin on 18.02.2016.
 */
@AndroidEntryPoint
class FavoritesFragment @Inject constructor() : Fragment() {
  private var sortOrder = SORT_BY_ADDED_DATE // default
  private val sharedPrefs by lazy {
    requireActivity().getSharedPreferences("favorites_prefs", Context.MODE_PRIVATE)
  }
  private var mFavoritesAdapter: FavoritesRecyclerViewAdapter? = null
  private var menuSortByAddedDate: MenuItem? = null
  private var menuSortByName: MenuItem? = null
  private var menuSortByNumber: MenuItem? = null
  private var currentOrderDirection: String = "ASC"

  private val favoritesViewModel: FavoritesViewModel by viewModels()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    if (savedInstanceState != null) {
      sortOrder = savedInstanceState.getInt(KEY_SORTED_BY, SORT_BY_ADDED_DATE)
      currentOrderDirection = savedInstanceState.getString(KEY_ORDER_DIRECTION, "ASC") ?: "ASC"
    } else {
      sortOrder = sharedPrefs.getInt(KEY_SORTED_BY, SORT_BY_ADDED_DATE)
      currentOrderDirection = sharedPrefs.getString(KEY_ORDER_DIRECTION, "ASC") ?: "ASC"
    }
    setHasOptionsMenu(true)
  }

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View? {
    val v = inflater.inflate(R.layout.fragment_favorite, container, false)
    val recyclerView = v.findViewById<RecyclerView>(R.id.rv_favorites)
    recyclerView.layoutManager = LinearLayoutManager(requireContext())

    mFavoritesAdapter = FavoritesRecyclerViewAdapter { songNumberId: Long ->
      val intentSongView = Intent(requireActivity(), SongActivity::class.java)
      intentSongView.putExtra(SongActivity.KEY_SONG_NUMBER_ID, songNumberId)
      startActivity(intentSongView)
    }
    recyclerView.adapter = mFavoritesAdapter

    observeFavorites()

    return v
  }

  private var observeFavoritesJob: Job? = null

  private fun observeFavorites() {
    synchronized(this) {
      observeFavoritesJob?.cancel()
      observeFavoritesJob = viewLifecycleOwner.lifecycleScope.launch {
        when (sortOrder) {
          SORT_BY_NUMBER -> favoritesViewModel.getFavoritesSortedByNumber(order = currentOrderDirection).collect { updateUI(it) }
          SORT_BY_NAME -> favoritesViewModel.getFavoritesSortedByName(order = currentOrderDirection).collect { updateUI(it) }
          SORT_BY_ADDED_DATE -> favoritesViewModel.getFavoritesSortedByDate(order = currentOrderDirection).collect { updateUI(it) }
        }
      }
    }
  }

  private fun updateUI(favorites: List<Favorite>) {
    mFavoritesAdapter?.submitList(favorites)
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState.putInt(KEY_SORTED_BY, sortOrder)
    outState.putString(KEY_ORDER_DIRECTION, currentOrderDirection)
    super.onSaveInstanceState(outState)
    
    with(sharedPrefs.edit()) {
      putInt(KEY_SORTED_BY, sortOrder)
      putString(KEY_ORDER_DIRECTION, currentOrderDirection)
      commit()
    }
  }

  override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    menuSortByAddedDate = menu.add(0, 1, 0, R.string.sort_by_added_date)
    menuSortByName = menu.add(0, 2, 0, R.string.sort_by_name)
    menuSortByNumber = menu.add(0, 3, 0, R.string.sort_by_number)
    super.onCreateOptionsMenu(menu, inflater)
    updateSortMenuIcons()
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    val handled = when (item.itemId) {
      menuSortByNumber!!.itemId -> {
        if (sortOrder == SORT_BY_NUMBER) {
          currentOrderDirection = if (currentOrderDirection == "ASC") "DESC" else "ASC"
        } else {
          sortOrder = SORT_BY_NUMBER
          currentOrderDirection = "ASC"
        }
        observeFavorites()
        updateSortMenuIcons()
        true
      }

      menuSortByName!!.itemId -> {
        if (sortOrder == SORT_BY_NAME) {
          currentOrderDirection = if (currentOrderDirection == "ASC") "DESC" else "ASC"
        } else {
          sortOrder = SORT_BY_NAME
          currentOrderDirection = "ASC"
        }
        observeFavorites()
        updateSortMenuIcons()
        true
      }

      menuSortByAddedDate!!.itemId -> {
        if (sortOrder == SORT_BY_ADDED_DATE) {
          currentOrderDirection = if (currentOrderDirection == "ASC") "DESC" else "ASC"
        } else {
          sortOrder = SORT_BY_ADDED_DATE
          currentOrderDirection = "ASC"
        }
        observeFavorites()
        updateSortMenuIcons()
        true
      }

      else -> super.onOptionsItemSelected(item)
    }
    with(sharedPrefs.edit()) {
      putInt(KEY_SORTED_BY, sortOrder)
      putString(KEY_ORDER_DIRECTION, currentOrderDirection)
      apply()
    }
    return handled
  }

  override fun onPrepareOptionsMenu(menu: Menu) {
    (menu as MenuBuilder).setOptionalIconsVisible(true)
  }

  private fun updateSortMenuIcons() {
    if (sortOrder == SORT_BY_ADDED_DATE) {
      val icon = if (currentOrderDirection == "ASC") R.drawable.ic_arrow_upward else R.drawable.ic_arrow_downward
      menuSortByAddedDate?.setIcon(icon)
    } else {
      menuSortByAddedDate?.setIcon(null)
    }
    if (sortOrder == SORT_BY_NAME) {
      val icon = if (currentOrderDirection == "ASC") R.drawable.ic_arrow_upward else R.drawable.ic_arrow_downward
      menuSortByName?.setIcon(icon)
    } else {
      menuSortByName?.setIcon(null)
    }
    if (sortOrder == SORT_BY_NUMBER) {
      val icon = if (currentOrderDirection == "ASC") R.drawable.ic_arrow_upward else R.drawable.ic_arrow_downward
      menuSortByNumber?.setIcon(icon)
    } else {
      menuSortByNumber?.setIcon(null)
    }
  }

  companion object {
    const val SORT_BY_ADDED_DATE = 2
    const val SORT_BY_NUMBER = 3
    const val SORT_BY_NAME = 4
    private const val KEY_SORTED_BY = "favorites-sorted-by"
    private const val KEY_ORDER_DIRECTION = "favorites-order-direction"
  }
}