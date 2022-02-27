package com.codinlogkeyboard

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForActivityResult(ActivityResultContracts.RequestPermission()) {
            Log.d(TAG,"success? $it")
        }.launch(Manifest.permission.SYSTEM_ALERT_WINDOW)
    }

    override fun onResume() {
        super.onResume()
    }
}