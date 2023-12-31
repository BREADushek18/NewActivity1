package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var buttonShowPic = findViewById<Button>(R.id.btn_show_pic)
        buttonShowPic.setOnClickListener{
            val intent = Intent(this, SecondActivity::class)
            var picLink = "https://farm66.staticflickr.com/65535/68165388924_4fa82f55a9_z.jpg"
            intent.putExtra(EXTRA_MESSAGE, picLink)
            startActivity(intent)
        }
    }
}