package com.dev.myintent

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class AnotherActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)

        val keyValue1 = intent.getStringExtra("key1")
        if(keyValue1 != null)
            Log.d("keyValue1 is", keyValue1)
    }
}