package com.example.dependencyinjection

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    @UserQualifier private val userService: UserService,
    private val alertService: AlertService,
    private val analyticsService: AnalyticsService
    ){

    fun createUser(email:String,password:String){
        userService.saveUser(email, password)
        alertService.sendMessage("Success")
        analyticsService.trackEvent("CREATE","User created.")
    }

}