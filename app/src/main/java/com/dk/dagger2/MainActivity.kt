package com.dk.dagger2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var studentRegistrationService: StudentRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerStudentRegistrationComponent.builder().studentRepositoryModule(StudentRepositoryModule(3)).
        //DaggerStudentRegistrationComponent.factory().create(4).Inject(this)
        val appComponent = (application as StudentApplication).eventTriggerAppComponent.getStudentComponentFactory()
        appComponent.create(6).Inject(this)
        studentRegistrationService.studentRegister("IRON MAN","989898989898")
    }
}