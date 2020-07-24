package com.paul9834.learn_kotlin.data.repo

import com.paul9834.learn_kotlin.model.FruitResponse
import com.paul9834.learn_kotlin.model.api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class FrutasRepository {

    fun getFruitList(onResult: (isSuccess: Boolean, response: FruitResponse?) -> Unit) {
        RetrofitClient.instance.getFruits().enqueue(object : Callback<FruitResponse> {
                override fun onResponse(call: Call<FruitResponse>?, response: Response<FruitResponse>?) {
                    if (response != null && response.isSuccessful)
                        onResult(true, response.body()!!)
                    else
                        onResult(false, null)
                }
                override fun onFailure(call: Call<FruitResponse>?, t: Throwable?) {
                    onResult(false, null)
                }
            })
    }

    companion object {
        private var INSTANCE: FrutasRepository? = null
        fun getInstance() = INSTANCE
            ?: FrutasRepository().also {
                INSTANCE = it
            }
    }

}



