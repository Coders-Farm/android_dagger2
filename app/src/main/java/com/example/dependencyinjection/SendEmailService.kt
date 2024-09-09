package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject


interface AlertService{
    fun sendMessage(message: String)
}

class SendEmailService(private val retryCount:Int):AlertService{

    override fun sendMessage(message:String){
        Log.e("User","Email sent successfully. $retryCount");
    }
}

class SendNotificationService:AlertService{
    override fun sendMessage(message: String) {
        Log.e("User","Notification sent successfully.");
    }
}