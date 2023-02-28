package com.example.ayufpjobsheet21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ayufpjobsheet21.Kelas
import com.example.ayufpjobsheet21.KelasAdapter

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "SITI KOTIJAH",
        "VIVI NUR AISYAH",
        "ZULFA SOFIANA",
        "AHMAD ARDHI SETIAWAN",
        "ANISATUR ROFIQOH",
        "AYU FEBRIANA PUTRI",
        "BOWO SAKTI WIRATAMA",
        "DANUARDI WAHYU P",
        "DEVA BODIANA",
        "DWI FEBRI STYANINGRUM",
        "EVA ROHAS"
    )
    lateinit var kelasView: RecyclerView
    lateinit var kelasAdapter: KelasAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kelasView = findViewById(R.id.kelasView)
        kelasView.layoutManager = LinearLayoutManager(this)

        for (i in listKelas.indices) {
            list.add(Kelas(listKelas[i]))
        }

        kelasAdapter = KelasAdapter(list)
        kelasAdapter.notifyDataSetChanged()
        kelasView.adapter = kelasAdapter
    }
}
