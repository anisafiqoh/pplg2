package com.example.heniwijayantijob21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heniwijayantijob21.Kelas
import com.example.heniwijayantijob21.KelasAdapter

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Kelas>()
    val listKelas = arrayOf(
        "DWI FEBRI STIYANINGRUM",
        "EVA ROHAS",
        "FELIM EDI PRABOWO",
        "FITRI RAHMAWATI",
        "HAMDAN AINUN NA'IM",
        "HENI WIJAYANTI",
        "IBNU RIF'AN",
        "JIHAN SALWA FITRIANI",
        "KOTIMATUS SA'ADAH",
        "LADA'ARDI SACHIO L",
        "LATIFAH IRYADIAH"
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
