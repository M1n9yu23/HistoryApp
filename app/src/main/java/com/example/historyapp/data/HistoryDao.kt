package com.example.historyapp.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.historyapp.model.History

@Dao
interface HistoryDao {
    @Query("SELECT * FROM history WHERE decade = :decade")
    fun getHistoriesByDecade(decade: String): List<History>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(histories: List<History>)
}
