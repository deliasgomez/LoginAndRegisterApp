package com.example.loginandregisterapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @ColumnInfo val name : String,
    @ColumnInfo @PrimaryKey val email: String,
    @ColumnInfo val password : String
)