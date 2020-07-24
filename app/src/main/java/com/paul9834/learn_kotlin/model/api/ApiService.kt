package com.paul9834.learn_kotlin.model.api

import com.paul9834.learn_kotlin.model.Fruit
import com.paul9834.learn_kotlin.model.FruitResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiService{

    @GET("posts")
    fun getFruits(): Call<FruitResponse>

}