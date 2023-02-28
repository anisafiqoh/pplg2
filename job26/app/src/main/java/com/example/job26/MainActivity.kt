package com.example.job26

import DBHelper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import layout.Siswa
import layout.SiswaAdapter

class MainActivity : AppCompatActivity() {
    latenit var siswaView: RecyclerView
    latenit var siswaAdapter: SiswaAdapter
    var db = DBHelper(this, null)
    var list = ArrayList<Siswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        siswaView = (R.)
    }

}