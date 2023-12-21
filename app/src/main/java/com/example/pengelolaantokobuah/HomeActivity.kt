package com.example.pengelolaantokobuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnTambah: Button = findViewById(R.id.tambah)
        btnTambah.setOnClickListener {

            val intent = Intent(this, FormTambahBarangActivity::class.java)
            startActivity(intent)
        }

        val btnlist: Button = findViewById(R.id.list)
        btnlist.setOnClickListener {

            val intent = Intent(this, ListKategoriActivity::class.java)
            startActivity(intent)
        }

        val btnLogut: Button = findViewById(R.id.btnLogout)
        btnLogut.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}