package com.example.pengelolaantokobuah

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DetailAdapter(val datadetail: List<DataItem?>?) : RecyclerView.Adapter<DetailAdapter.MyViewHolder>(){
    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val namaBuah = view.findViewById<TextView>(R.id.tvBuah)
        val tanggal = view.findViewById<TextView>(R.id.tvTanggal)
        val jumlah = view.findViewById<TextView>(R.id.tvJumlah)
        val spesifikasi = view.findViewById<TextView>(R.id.tvSpesifikasi)
        val keterangan = view.findViewById<TextView>(R.id.tvKeterangan)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_detail_barang, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        if (datadetail != null){
            return datadetail.size
        }
        return 0
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaBuah.text = datadetail?.get(position)?.namaBarang
        holder.tanggal.text = datadetail?.get(position)?.tanggal

        val jumlahBarang = datadetail?.get(position)?.jumlahBarang?.toString()
        holder.jumlah.text = jumlahBarang

        //holder.jumlah.text = datadetail?.get(position)?.jumlahBarang
        holder.spesifikasi.text = datadetail?.get(position)?.spesifikasi
        holder.keterangan.text = datadetail?.get(position)?.keterangan
    }

}