package Controllers

import com.paul9834.learn_kotlin.model.Fruit
import retrofit2.Call
import retrofit2.http.GET

interface Endpoint{

    @GET("posts")
    fun getFeed(): Call<List<Fruit>>

}