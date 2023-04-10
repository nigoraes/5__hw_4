package com.example.a5__hw_4.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoveService {
    var retrofit =
        Retrofit.Builder().baseUrl("https://love-calculator.p.rapidapi.com/").addConverterFactory(
            GsonConverterFactory.create()
        ).build()

    var api = retrofit.create(LoveApi::class.java)
}