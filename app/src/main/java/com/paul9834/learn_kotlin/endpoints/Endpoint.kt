package com.paul9834.learn_kotlin.endpoints

import com.paul9834.learn_kotlin.model.Fruit
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint{

    @GET("posts")
    fun getFruits(): Call<List<Fruit>>

}