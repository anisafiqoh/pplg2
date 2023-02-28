package com.example.salmajob14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TO = findViewById<Button>(R.id.btnTo)
        val TPFL = findViewById<Button>(R.id.btnTpfl)
        val PPLG = findViewById<Button>(R.id.btnPplg)
        val Kuliner = findViewById<Button>(R.id.btnKuliner)
        val Busana = findViewById<Button>(R.id.btnBusana)

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, OtomotifFragment())
            fragmentTransaction.commit()
        }

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PengelasanFragment())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PplgFragment())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentTransaction.commit()
        }
    }
}