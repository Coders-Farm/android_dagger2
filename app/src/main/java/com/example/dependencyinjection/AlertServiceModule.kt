package com.example.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AlertServiceModule {

    @ActivityScope
    @Provides
    fun getSendEmailService(retryCount:Int):AlertService{
        return SendEmailService(retryCount)
    }

}