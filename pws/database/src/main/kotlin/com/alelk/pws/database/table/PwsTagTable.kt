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
package com.alelk.pws.database.table

import android.database.sqlite.SQLiteDatabase

/**
 * PWS History Table
 *
 * Created by Mykhailo Dmytriakha on 20.03.2024.
 */
object PwsTagTable {
  const val TABLE_TAG = "tags"
  const val COLUMN_ID = "id"
  const val COLUMN_NAME = "name"
  const val COLUMN_COLOR = "color"
  const val COLUMN_PRIORITY = "priority"
  const val COLUMN_PREDEFINED = "predefined"
}