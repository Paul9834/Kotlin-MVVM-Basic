package com.paul9834.learn_kotlin.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.paul9834.learn_kotlin.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FrutasRepository {

    private val listData = MutableLiveData<List<Fruit>>()

    fun searchFruits(): LiveData<List<Fruit>> {

        val call : Call<List<Fruit>> = RetrofitClient.getClient.getFruits()
        call.enqueue(object : Callback<List<Fruit>>{

            override fun onFailure(call: Call<List<Fruit>>, t: Throwable) {
            }

            override fun onResponse(call: Call<List<Fruit>>, response: Response<List<Fruit>>) {
                if (response.isSuccessful) {
                    listData.postValue(response.body())
                }
            }
        })
        return listData
    }
}