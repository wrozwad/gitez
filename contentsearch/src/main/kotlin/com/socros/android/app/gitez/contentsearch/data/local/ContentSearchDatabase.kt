package com.socros.android.app.gitez.contentsearch.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.socros.android.app.gitez.contentsearch.data.QuestionItem

@Database(entities = [QuestionItem::class], version = 2)
abstract class ContentSearchDatabase : RoomDatabase() {
	abstract fun contentSearchDao(): ContentSearchDao
}
