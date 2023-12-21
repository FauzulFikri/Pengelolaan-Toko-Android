package com.example.pengelolaantokobuah.api

import com.example.pengelolaantokobuah.ResponseDetail1
import com.example.pengelolaantokobuah.ResponseDetail2
import com.example.pengelolaantokobuah.model.Barang
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("barang/1")
    fun getdetail1 () : Call<ResponseDetail1>

    @GET("barang/2")
    fun getdetail2 () : Call<ResponseDetail2>

    @POST("barangs")
    abstract fun createBarang(@Body barang: Barang): Call<Barang>

}