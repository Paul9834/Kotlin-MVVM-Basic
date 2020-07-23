package com.paul9834.learn_kotlin.domain

import com.paul9834.learn_kotlin.data.FrutasRepository
import com.paul9834.learn_kotlin.ui.modelo.Frutas

class FrutasUseCase  {

    private val frutasDataSet = FrutasRepository()

    // Aqui retornar la lista de frutas //
    fun obtenerListadeFrutas (): List<Frutas> {
        return frutasDataSet.crearListFruits()
    }
}