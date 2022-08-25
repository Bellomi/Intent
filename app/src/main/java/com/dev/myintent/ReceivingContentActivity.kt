package com.dev.myintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import com.google.firebase.database.core.Platform

class ReceivingContentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiving_content)

        when {
            intent?.action == Intent.ACTION_SEND -> {
                if ("text/plain" == intent.type) {
                    handleSendText(intent) // Handle text being sent
//                } else if (intent.type?.startsWith("image/") == true) {
//                    handleSendImage(intent) // Handle single image being sent
//                }
//            }
//            intent?.action == Intent.ACTION_SEND_MULTIPLE
//                    && intent.type?.startsWith("image/") == true -> {
//                handleSendMultipleImages(intent) // Handle multiple images being sent
            }
        }
    }
}

    private fun handleSendText(intent: Intent) {
        intent.getStringExtra(Intent.EXTRA_TEXT)?.let {
            }
        }
    }


//    private fun handleSendImage(intent: Intent) {
//        (intent.getParcelableExtra<Parcelable>(Intent.EXTRA_STREAM) as? Uri)?.let {
//            // Update UI to reflect image being shared
//        }
//    }
//
//    private fun handleSendMultipleImages(intent: Intent) {
//        intent.getParcelableArrayListExtra<Parcelable>(Intent.EXTRA_STREAM)?.let {
//            // Update UI to reflect multiple images being shared

//    }
//    }
//}