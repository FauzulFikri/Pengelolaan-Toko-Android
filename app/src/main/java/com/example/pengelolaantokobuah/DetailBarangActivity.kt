package com.example.pengelolaantokobuah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pengelolaantokobuah.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DetailBarangActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_barang)

        val detailbarang = findViewById<RecyclerView>(R.id.rvDetail)
        ApiConfig.getService().getdetail1().enqueue(object : Callback<ResponseDetail1> {
            override fun onResponse(
                call: Call<ResponseDetail1>,
                response: Response<ResponseDetail1>
            ) {
                if (response.isSuccessful) {
                    val responseDetail1 = response.body()
                    val datadetail = responseDetail1?.data
                    val detailAdapter = DetailAdapter(datadetail)
                    detailbarang.apply {
                        layoutManager = LinearLayoutManager(this@DetailBarangActivity)
                        setHasFixedSize(true)
                        detailAdapter.notifyDataSetChanged()
                        adapter = detailAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseDetail1>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })


        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        // Set a click listener for the Toolbar
        toolbar.setOnClickListener {
            val intent = Intent(this, ListKategoriActivity::class.java)
            startActivity(intent)
        }
    }
}