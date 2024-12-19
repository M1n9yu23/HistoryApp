package com.example.historyapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history")
data class History(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "year")
    val year: String,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "decade")
    val decade: String,// "1900년대", "1910년대" 등
    @ColumnInfo(name = "detail_desc")
    val detailDesc: String? = null
)