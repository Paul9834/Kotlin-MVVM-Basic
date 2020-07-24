package com.paul9834.learn_kotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.paul9834.learn_kotlin.domain.FrutasUseCase
import com.paul9834.learn_kotlin.model.Fruit

class MainViewModel : ViewModel() {

    // Lista de datos de frutas //

    var data_response: LiveData<List<Fruit>>? = null

    // Casos de uso de Frutas //

    val frutasUseCase = FrutasUseCase()

    init {
        getListFrutas()
    }
    // Ingresa la información de las frutas //

    fun setInformacion (frutas : LiveData<List<Fruit>>) {
        data_response = frutas
    }

    // Obtiene la lista de frutas //
    fun getListFrutas () {
        setInformacion(frutasUseCase.obtenerListadeFrutas())
    }

    // Retorna la lista de frutas //
    fun getListaFrutasLiveData (): LiveData<List<Fruit>>? {
        return data_response
    }

}