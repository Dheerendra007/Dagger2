package com.dk.dagger2.component

import com.dk.dagger2.EventTrigger
import com.dk.dagger2.module.EventTriggerModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [EventTriggerModule::class])
interface EventTriggerAppComponent {
    fun getStudentComponentFactory():StudentRegistrationComponent.Factory
}