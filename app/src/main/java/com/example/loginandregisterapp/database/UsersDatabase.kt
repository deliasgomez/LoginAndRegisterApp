package com.example.loginandregisterapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(
    entities = [User::class],
    version = 1
)
abstract class UsersDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    companion object {
        @Volatile
        private var INSTANCE: UsersDatabase? = null
        fun getDatabase(context: Context): UsersDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UsersDatabase::class.java,
                    "item_database"
                ).allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                return instance
            }
        }
    }



}