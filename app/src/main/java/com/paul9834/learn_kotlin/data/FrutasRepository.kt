package com.paul9834.learn_kotlin.data

import androidx.lifecycle.MutableLiveData
import com.paul9834.learn_kotlin.ui.modelo.Frutas

class FrutasRepository {


    fun crearListFruits (): List<Frutas> {
        return listOf(Frutas("Manazana","Amarillo", 100F, 100F)
            , Frutas("Manzana", "Amarillo", 300f, 10f))

    }

}