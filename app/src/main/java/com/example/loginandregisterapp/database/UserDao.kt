package com.example.loginandregisterapp.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.loginandregisterapp.database.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user : User)

    @Query("SELECT * FROM users WHERE email = :email")
    suspend fun getByEmail(email: String) : User?

    @Query("SELECT * FROM  users WHERE email = :email and password = :password")
    suspend fun getByEmailAndPass(email : String, password: String ) : User?

}