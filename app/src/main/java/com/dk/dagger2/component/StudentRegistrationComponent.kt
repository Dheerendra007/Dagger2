package com.dk.dagger2.component

import com.dk.dagger2.MainActivity
import com.dk.dagger2.module.NotificationServiceModule
import com.dk.dagger2.module.StudentRepositoryModule
import com.dk.dagger2.scop.ActivityScop
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@ActivityScop
@Subcomponent( modules = [NotificationServiceModule::class,StudentRepositoryModule::class])
interface StudentRegistrationComponent {
    fun Inject(mainActivity: MainActivity)

    @Subcomponent.Factory // In new app always use Factory to prevent runtime error, Always we need to pass versionNo then project will run
    interface Factory{
        fun create(@BindsInstance versionNo: Int):
                StudentRegistrationComponent
    }

   /* @Subcomponent.Builder
    interface Builder{
        fun build():StudentRegistrationComponent
        fun versionNumber(@BindsInstance versionNo: Int): Builder
    }*/
}