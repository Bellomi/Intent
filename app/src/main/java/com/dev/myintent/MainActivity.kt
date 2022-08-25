package com.dev.myintent

import android.content.Intent
import android.os.Bundle
import android.telephony.TelephonyManager
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSubmit = findViewById<Button>(R.id.submit_button)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java).apply{
                putExtra("key1", "value1")
            }
            startActivity(intent)
        }








        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "This is what I´m typing")
        }

        val shareIntent = Intent.createChooser(sendIntent, null)
        startActivity(shareIntent)




        fun telephonyManager() =
            getSystemService(TelephonyManager::class.java)
        telephonyManager()?.simOperator
        telephonyManager()?.networkOperator
        Log.d("MCC", telephonyManager().simOperator)
        Log.d("MNC", telephonyManager().networkOperator)
    }
}




