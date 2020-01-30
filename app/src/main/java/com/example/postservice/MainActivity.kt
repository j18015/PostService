package com.example.postservice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var b1:Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b1 = findViewById(R.id.button1) as Button
        b1!!.setOnClickListener{
            val post = AsyncHttp("Android",10.11)
            post.execute()
        }
    }
}
