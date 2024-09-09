package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject


interface UserService{
    fun saveUser(email: String,password: String)
}

class FirebaseUserRepository:UserService{
    override fun saveUser(email: String, password: String) {
        Log.e("User","User saved to firebase successfully: $email")
    }

}

class DatabaseUserRepository @Inject constructor():UserService{
    override fun saveUser(email: String, password: String) {
        Log.e("User","User saved to database successfully: $email")
    }

}