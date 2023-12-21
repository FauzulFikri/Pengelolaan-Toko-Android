package com.example.pengelolaantokobuah.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    const val baseURL = "http://192.168.137.1/PengelolaanTokoBuah/public/api/"
    fun getRetrofit() : Retrofit{
        return Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build()
    }

    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }
}