package com.example.a5__hw_4.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.a5__hw_4.remote.LoveModel
import com.example.a5__hw_4.remote.LoveService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getPercentage(firstName: String, secondName: String): MutableLiveData<LoveModel> {
        val mutableLiveData = MutableLiveData<LoveModel>()
        LoveService().api.getPercentage(firstName, secondName)
            .enqueue(object : Callback<LoveModel> {
                override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                    mutableLiveData.postValue(response.body())
                }

                override fun onFailure(call: Call<LoveModel>, t: Throwable) {
                    Log.e("ololo", "onFailure: ${t.message} ")
                }
            })
        return mutableLiveData
    }
}