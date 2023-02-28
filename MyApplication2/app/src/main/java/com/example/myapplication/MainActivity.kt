package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnNext: Button = findViewById(R.id.button)
        val btnprofile: Button = findViewById(R.id.button2)

        btnNext.setOnClickListener(
            val intent = Intent(this, MainActivity2::class.java)
        )
    }
}
