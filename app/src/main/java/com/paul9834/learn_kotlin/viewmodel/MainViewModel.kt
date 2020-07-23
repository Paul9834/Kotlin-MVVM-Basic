package com.paul9834.learn_kotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.paul9834.learn_kotlin.data.FrutasRepository
import com.paul9834.learn_kotlin.domain.FrutasUseCase
import com.paul9834.learn_kotlin.ui.modelo.Frutas

class MainViewModel : ViewModel() {

    private val listData = MutableLiveData<List<Frutas>>()
    val frutasUseCase = FrutasUseCase()


    fun setInformacion (frutas : List<Frutas>) {
        listData.value = frutas
    }

    fun getListFrutas () {
        setInformacion(frutasUseCase.obtenerListadeFrutas())
    }





}