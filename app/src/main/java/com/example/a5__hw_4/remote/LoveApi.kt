package com.example.a5__hw_4.remote

import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {
    @GET("getPercentage")
    fun getPercentage(
        @Query("fname") firstName: String,
        @Query("sname") secondName: String,
        @Header("X-RapidAPI-Key") key: String = "497568fa95mshd9f14f62e134030p10a47cjsnf8ef70c72111",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): retrofit2.Call<LoveModel>
}