package com.dk.dagger2.module

import com.dk.dagger2.DynamoDBService
import com.dk.dagger2.NotificationService
import com.dk.dagger2.SMSService
import com.dk.dagger2.scop.ActivityScop
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class NotificationServiceModule {

 /*   @Provides
    fun getDynamoDBService(): NotificationService {
        return DynamoDBService()
    }*/

    /*   @Provides
   fun getSMSService(sMSService:SMSService): NotificationService {
       return sMSService
   }*/

    @Binds
    @ActivityScop
    abstract fun getSMSService(sMSService:SMSService): NotificationService
}