package com.dk.dagger2

import android.content.ContentValues
import android.util.Log


interface EventTrigger {
    fun eventFire(eventType:String,callFrom:String)
}

class SaveDataInDBEvent:EventTrigger{
    override fun eventFire(eventType: String, callFrom: String) {
        Log.d(ContentValues.TAG,"Student EventTrigger SaveDataInDBEvent type $eventType and called from:$callFrom")
    }
}

class SaveDataOnServer():EventTrigger{
    override fun eventFire(eventType: String, callFrom: String) {
        Log.d(ContentValues.TAG,"Student EventTrigger SaveDataOnServer type $eventType and called from:$callFrom")
    }
}
