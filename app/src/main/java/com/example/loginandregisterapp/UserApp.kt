package com.example.loginandregisterapp

import android.app.Application
import com.example.loginandregisterapp.database.UsersDatabase

class UserApp: Application() {

    val database: UsersDatabase by lazy { UsersDatabase.getDatabase(this) }

}