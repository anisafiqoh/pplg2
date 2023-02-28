package com.example.sqlitepplg2
import db
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import layout.Siswa
import layout.SiswaAdapter

class MainActivity : AppCompatActivity() {
    latenit var siswaView: RecyclerView
    latenit var siswaAdapter: SiswaAdapter
    var db = dbhalper(this, null)
    var list = ArrayList<Siswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        siswaView = (R.)
    }


}