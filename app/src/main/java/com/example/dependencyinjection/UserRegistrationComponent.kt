package com.example.dependencyinjection

import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Inject
import javax.inject.Singleton


@ActivityScope
@Subcomponent(modules = [UserRegistrationModule::class,AlertServiceModule::class])
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun build():UserRegistrationComponent
        fun setRetryCount(@BindsInstance retryCount: Int):Builder

    }

}