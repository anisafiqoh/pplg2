package com.example.anisa20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import  com.example.anisa20.Kelas

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listNama = arrayOf(
        "SITI KOTIJAH",
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU P",
        "DEVA BUDIANA ",
        "DWI FEBRI STYANINGRUM",
        "EVA ROHOS"
    )

    val listNis = arrayOf(
        "3033",
        "3035",
        "3039",
        "2973",
        "2974",
        "2977",
        "2979",
        "2981",
        "2982",
        "2985",
        "2987",
    )

    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.makananView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Kelas(listNama[i], listNis[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}