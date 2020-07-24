package com.paul9834.learn_kotlin.model

data class FruitResponse(
    val total_count: Int,
    val incomplete_results: Boolean,
    val items: List<Fruit>
)

data class Fruit(val userId: String = "",
                 val id: String = "",
                 val title: String = "",
                 val body: String = "")