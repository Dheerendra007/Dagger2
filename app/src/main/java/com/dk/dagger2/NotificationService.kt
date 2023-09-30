package com.dk.dagger2

import android.content.ContentValues.TAG
import android.util.Log
import com.dk.dagger2.scop.ActivityScop
import javax.inject.Inject

interface NotificationService{
    fun sendMsg(to:String,from:String,msg:String){
        Log.d(TAG,"Student SMS Sent to $to and msg is:$msg")
    }
}

@ActivityScop
class SMSService @Inject constructor(val eventTrigger: EventTrigger):NotificationService{
    override fun sendMsg(studentName: String, studentMobileNo: String, msg: String) {
        Log.d(TAG,"Student Record SMS Sent to $studentName and msg is:$msg")
        eventTrigger.eventFire("SMSService","NotificationService")
    }
}

class DynamoDBService(val eventTrigger: EventTrigger) :NotificationService{
    override fun sendMsg(studentName: String, studentMobileNo: String, msg: String) {
        Log.d(TAG,"Student Record DynamoDB SMS Sent to $studentName and msg is:$msg")
        eventTrigger.eventFire("DynamoDBService","NotificationService")
    }
}