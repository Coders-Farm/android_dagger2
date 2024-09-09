package com.example.dependencyinjection

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton


interface AnalyticsService{
    fun trackEvent(eventName:String,message:String)
}

@Singleton
class FirebaseAnalytics @Inject constructor():AnalyticsService {
    override fun trackEvent(eventName: String, message: String) {
        Log.e("User","event name: $eventName message: $message")
    }
}

class MoEngageAnalytics:AnalyticsService {
    override fun trackEvent(eventName: String, message: String) {
        Log.e("User","event name: $eventName message: $message")
    }
}