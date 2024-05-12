package com.example.lab04mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LaunchActivity : AppCompatActivity() {

    lateinit var startBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)

        startBtn = findViewById(R.id.startBtn)


        startBtn.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}