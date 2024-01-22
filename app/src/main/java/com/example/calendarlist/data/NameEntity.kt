package com.example.calendarlist.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "name_table")
data class NameEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val task: String
)