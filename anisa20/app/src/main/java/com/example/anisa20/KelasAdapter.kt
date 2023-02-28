package com.example.anisa20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.anisa20.Kelas

class KelasAdapter(private val list:ArrayList<Kelas>): RecyclerView.Adapter<KelasAdapter.KelasViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KelasViewHolder {
        return KelasViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_list, parent, false))
    }

    override fun onBindViewHolder(holder: KelasViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class KelasViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.textNama)
        private val nis = itemView.findViewById<TextView>(R.id.textNis)
        fun bind(get: Kelas) {
            nama.text = get.nama
            nis.text = get.nis
        }
    }
}