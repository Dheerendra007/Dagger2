package com.dk.dagger2

import com.dk.dagger2.qualifier.FirebaseQualifier
import javax.inject.Inject
import javax.inject.Named

class StudentRegistrationService @Inject constructor(@FirebaseQualifier private val
                                                     studentRepository: StudentRepository,
                                                     private val notificationService: NotificationService) {

    fun studentRegister(studentName:String,studentMobileNo:String){
        studentRepository.saveStudentRecord(studentName,studentMobileNo)
        notificationService.sendMsg(studentMobileNo,"9990990990","I am IRON MAN")
    }
}