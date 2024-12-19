package com.example.historyapp.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.historyapp.model.History


@Database(entities = [History::class], version = 1)
abstract class HistoryDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao

    companion object {
        @Volatile
        private var INSTANCE: HistoryDatabase? = null

        fun getDatabase(context: Context): HistoryDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context.applicationContext,
                    HistoryDatabase::class.java,
                    "history_database"
                ).build().also { INSTANCE = it }
            }
        }
    }
}
