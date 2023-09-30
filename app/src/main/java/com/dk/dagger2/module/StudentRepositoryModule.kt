package com.dk.dagger2.module

import com.dk.dagger2.FirebaseRepository
import com.dk.dagger2.NotificationService
import com.dk.dagger2.SMSService
import com.dk.dagger2.SqliteRepository
import com.dk.dagger2.StudentRepository
import com.dk.dagger2.qualifier.FirebaseQualifier
import com.dk.dagger2.scop.ActivityScop
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Qualifier

@Module
class StudentRepositoryModule() {

    @ActivityScop
    @FirebaseQualifier // This will use to prevent named typo mistake
    @Provides
    fun getFirebaseRepository(versionNo: Int): StudentRepository {
        return FirebaseRepository(versionNo)
    }

    @Named("sqlite")
    @Provides
    @ActivityScop
    fun getSqliteRepository(sqliteRepository: SqliteRepository): StudentRepository{
        return sqliteRepository
    }
}