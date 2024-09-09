package com.example.dependencyinjection

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRegistrationModule {

    @Named("firebase")
    @Provides
    fun getFirebaseUserRepository():UserService{
        return FirebaseUserRepository()
    }

    @UserQualifier
    @Provides
    fun getDatabaseUserRepository(databaseUserRepository: DatabaseUserRepository):UserService{
        return databaseUserRepository
    }

}