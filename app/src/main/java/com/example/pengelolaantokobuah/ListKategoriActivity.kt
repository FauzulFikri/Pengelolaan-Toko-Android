package com.example.pengelolaantokobuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView

class ListKategoriActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        val bthome:ImageView = findViewById(R.id.bthome)
        bthome.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btnkategori: CardView = findViewById(R.id.bttropis)
        btnkategori.setOnClickListener {

            val intent = Intent(this, DetailBarangActivity::class.java)
            startActivity(intent)
        }

        val btnkategori1: CardView = findViewById(R.id.btsubtropis)
        btnkategori1.setOnClickListener {

            val intent = Intent(this, DetailBarangActivity1 ::class.java)
            startActivity(intent)
        }
    }


}