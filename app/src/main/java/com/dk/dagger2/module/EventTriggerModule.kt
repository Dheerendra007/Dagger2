package com.dk.dagger2.module

import com.dk.dagger2.EventTrigger
import com.dk.dagger2.SaveDataInDBEvent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class EventTriggerModule {

    @Singleton
    @Provides
    fun getEventTrigger(): EventTrigger {
        return SaveDataInDBEvent()
    }
}