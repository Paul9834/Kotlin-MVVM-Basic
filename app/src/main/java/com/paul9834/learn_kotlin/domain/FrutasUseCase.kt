package com.paul9834.learn_kotlin.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.paul9834.learn_kotlin.model.FrutasRepository
import com.paul9834.learn_kotlin.model.Fruit

class FrutasUseCase  {

    private val frutasDataSet = FrutasRepository()

    // Aqui retornar la lista de frutas //
    fun obtenerListadeFrutas (): LiveData<List<Fruit>> {
        return frutasDataSet.searchFruits()
    }
}