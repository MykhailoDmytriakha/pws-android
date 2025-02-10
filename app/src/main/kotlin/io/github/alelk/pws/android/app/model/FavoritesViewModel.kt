package io.github.alelk.pws.android.app.model

import androidx.lifecycle.ViewModel
import io.github.alelk.pws.database.PwsDatabase
import io.github.alelk.pws.database.dao.Favorite
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class FavoritesViewModel @Inject constructor(database: PwsDatabase) : ViewModel() {
  private val favoritesDao = database.favoriteDao()
  fun getFavoritesSortedByDate(order: String = "ASC"): Flow<List<Favorite>> = favoritesDao.getAll(sort = "default", order = order)
  fun getFavoritesSortedByName(order: String = "ASC"): Flow<List<Favorite>> = favoritesDao.getAll(sort = "songName", order = order)
  fun getFavoritesSortedByNumber(order: String = "ASC"): Flow<List<Favorite>> = favoritesDao.getAll(sort = "songNumber", order = order)

  @Deprecated("use toggleFavorite on SongViewModel")
  suspend fun toggleFavorite(songNumberId: Long) = favoritesDao.toggleFavorite(songNumberId)
}