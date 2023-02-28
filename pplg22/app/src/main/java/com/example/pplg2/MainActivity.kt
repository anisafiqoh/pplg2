package com.example.pplg2

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnterong = findViewById<ImageButton>(R.id.imageButton)
        val btnwortel = findViewById<ImageButton>(R.id.imageButton7)
        val btnselada = findViewById<ImageButton>(R.id.imageButton3)
        val btntomat = findViewById<ImageButton>(R.id.imageButton6)
        val btncabai = findViewById<ImageButton>(R.id.imageButton5)
        val btnbawang = findViewById<ImageButton>(R.id.imageButton4)
        btnterong.setOnClickListener {
            val intent = Intent(this, terong::class.java)
            startActivity(intent)
        }
        btnwortel.setOnClickListener {
            val intent = Intent(this, wortel::class.java)
            startActivity(intent)
        }
        btnselada.setOnClickListener {
            val intent = Intent(this, selada::class.java)
            startActivity(intent)
        }
        btntomat.setOnClickListener {
            val intent = Intent(this, tomat::class.java)
            startActivity(intent)
        }
        btncabai.setOnClickListener {
            val intent = Intent(this, cabai::class.java)
            startActivity(intent)
        }
        btnbawang.setOnClickListener {
            val intent = Intent(this, bawang::class.java)
            startActivity(intent)
        }
    }

}