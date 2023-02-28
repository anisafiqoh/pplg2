package layout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView.RecyclerListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan1.R

class SiswaAdapter(private val data: ArrayList<Siswa>) : RecyclerView.Adapter<SiswaAdapter.SiswaViewHolder>() {

    class SiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaSiswa)
        private val nis = itemView.findViewById<TextView>(R.id.nisSiswa)
        fun bind(get: Siswa) {
            nama.text = get.nama
            nis.text = get.nis
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SiswaViewHolder {
        return SiswaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_siswa, parent, false)
        )
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: SiswaViewHolder, position: Int) {
    holder.bind(data [position])
}
   override fun getItemCount(): Int {
       return
   }
}