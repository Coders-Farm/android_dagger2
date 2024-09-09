package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userService:UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = (application as App).appComponent
        val userRegistrationComponent = component.getUserRegistrationComponentBuilder()
            .setRetryCount(3)
            .build()

        userRegistrationComponent.inject(this)
        userService.createUser("test@gmail.com","123456")

    }
}

class Car(private val engine: Engine){

    fun startCar(){
        Log.e("Car","Car is starting...")
        engine.startEngine()
    }

}

class Engine(){
    fun startEngine(){
        Log.e("Engine","Started.")
    }
}