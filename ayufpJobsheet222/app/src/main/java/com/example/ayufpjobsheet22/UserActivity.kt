package com.example.ayufpjobsheet22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UserActivity : AppCompatActivity() {

    private lateinit var logoutbtn: Button
    private lateinit var nama_lengkap: TextView
    private lateinit var sessionManager: Session

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        sessionManager = Session(this)

        logoutbtn = findViewById(R.id.btnLogout)
        nama_lengkap = findViewById(R.id.textNama)

        if(!sessionManager.isLoggedIn()) {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            nama_lengkap.text = sessionManager.getUser()
        }

        logoutbtn.setOnClickListener {
            val session = sessionManager.logout()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}