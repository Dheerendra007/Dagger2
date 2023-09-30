package com.dk.dagger2.qualifier

import java.lang.annotation.Documented
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier //If you want your annotation is Qualifier
@Documented  //It will be use in java
@Retention(RetentionPolicy.RUNTIME) // annotation valid all app until running
annotation class FirebaseQualifier()
