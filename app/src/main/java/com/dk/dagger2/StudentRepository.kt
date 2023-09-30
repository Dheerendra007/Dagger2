package com.dk.dagger2

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

interface StudentRepository{
    fun saveStudentRecord(studentName:String,studentMobileNo:String){
        Log.d(TAG,"Student Record Save : $studentName")
    }
}

class SqliteRepository @Inject constructor():StudentRepository{
    override fun saveStudentRecord(studentName:String, studentMobileNo:String){
        Log.d(TAG,"Student Record Save in Sqlite : $studentName")
    }
}

class FirebaseRepository(private val versionNo:Int):StudentRepository{
    override fun saveStudentRecord(studentName:String, studentMobileNo:String){
        Log.d(TAG,"Student Record Save in Firebase  : $studentName"+"And version number is :$versionNo")
    }
}