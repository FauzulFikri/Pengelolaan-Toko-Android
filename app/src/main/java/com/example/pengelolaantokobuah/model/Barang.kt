package com.example.pengelolaantokobuah.model

import com.google.gson.annotations.SerializedName

data class Barang(
    @SerializedName("nama") val nama: String,
    @SerializedName("kategori") val kategori: String,
    @SerializedName("jumlah") val jumlah: Int,
    @SerializedName("spesifikasi") val spesifikasi: String,
    @SerializedName("kondisi") val kondisi: String,
    @SerializedName("keterangan") val keterangan: String
)
