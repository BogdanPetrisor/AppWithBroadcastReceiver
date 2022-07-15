package com.example.appwithbroadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneModeChangedReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnabled = intent?.getBooleanExtra("state",false) ?: return
        if (isAirPlaneModeEnabled){
            Toast.makeText(context,"AirPlane mode is enable",Toast.LENGTH_LONG).show()
        }else {
            Toast.makeText(context,"AirPlane mode is disable",Toast.LENGTH_LONG).show()
        }
    }
}