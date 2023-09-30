package com.dk.dagger2

import android.app.Application
import com.dk.dagger2.component.DaggerEventTriggerAppComponent
import com.dk.dagger2.component.EventTriggerAppComponent

class StudentApplication: Application() {

    lateinit var eventTriggerAppComponent: EventTriggerAppComponent

    override fun onCreate() {
        super.onCreate()
        eventTriggerAppComponent = DaggerEventTriggerAppComponent.builder().build()
    }
}
