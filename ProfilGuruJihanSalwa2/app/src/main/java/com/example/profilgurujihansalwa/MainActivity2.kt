package com.example.profilgurujihansalwa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnrequestguru2 = findViewById<Button>(R.id.btnrequestguru2)

        btnrequestguru2.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)


        }
    }
}