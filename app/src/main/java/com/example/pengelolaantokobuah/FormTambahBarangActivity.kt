package com.example.pengelolaantokobuah

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.pengelolaantokobuah.api.ApiService
import com.example.pengelolaantokobuah.model.Barang
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FormTambahBarangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_tambah_barang)

        val btntambah: Button = findViewById(R.id.btnTambah)
        btntambah.setOnClickListener {
            // Handle tombol tambah di sini (jika diperlukan)

            // Contoh: Pindah ke halaman HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        toolbar.setOnClickListener {
            // Handle klik toolbar di sini (jika diperlukan)

            // Contoh: Pindah ke halaman HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Menggunakan RetrofitClient.instance yang sudah diinisialisasi sebelumnya
        val apiService = RetrofitClient.instance

        // Membuat objek Barang untuk dikirim ke API Laravel
        val barang = Barang(
            nama = "Nama Barang",
            kategori = "Kategori Buah",
            jumlah = 5,
            spesifikasi = "Spesifikasi Barang",
            kondisi = "Kondisi Barang",
            keterangan = "Keterangan Barang"
        )

        // Melakukan request ke API untuk menyimpan data barang
        val call = apiService.createBarang(barang)

        call.enqueue(object : Callback<Barang> {
            override fun onResponse(call: Call<Barang>, response: Response<Barang>) {
                if (response.isSuccessful) {
                    // Handle response dari server jika sukses
                    val createdBarang = response.body()
                    // Tambahkan logika sesuai kebutuhan
                    Log.d("FormTambahBarang", "Barang berhasil ditambahkan: $createdBarang")
                } else {
                    // Handle response dari server jika tidak sukses
                    Log.e("FormTambahBarang", "Error: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<Barang>, t: Throwable) {
                // Handle kegagalan koneksi atau request
                Log.e("FormTambahBarang", "Error: ${t.message}")
            }
        })
    }
}
