package com.example.profilteacherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnrequestguru = findViewById<Button>(R.id.btnrequestguru)


        btnrequestguru.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            val btnrequestguru = findViewById<Button>(R.id.btnrequestguru)

            btnrequestguru.setOnClickListener {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }

        }
    }
}