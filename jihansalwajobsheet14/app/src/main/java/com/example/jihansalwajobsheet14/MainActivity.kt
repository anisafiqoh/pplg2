package com.example.jihansalwajobsheet14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val TO = findViewById<Button>(R.id.btnTO)
        val TPFL = findViewById<Button>(R.id.btnTPFL)
        val PPLG = findViewById<Button>(R.id.btnPPLG)
        val Kuliner = findViewById<Button>(R.id.btnKuliner)
        val Busana = findViewById<Button>(R.id.btnBusana)

        TO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Fragment_otomotif())
            fragmentTransaction.commit()
        }

        TPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Fragment_pengelasan())
            fragmentTransaction.commit()
        }

        PPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Fragment_pplg())
            fragmentTransaction.commit()
        }

        Kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Fragment_kuliner())
            fragmentTransaction.commit()
        }

        Busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, Fragment_busana())
            fragmentTransaction.commit()
        }
    }
}