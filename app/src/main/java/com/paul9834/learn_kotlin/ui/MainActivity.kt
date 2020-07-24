package com.paul9834.learn_kotlin.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.paul9834.learn_kotlin.R
import com.paul9834.learn_kotlin.model.Fruit
import com.paul9834.learn_kotlin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        val frutasObserver = Observer<List<Fruit>> {
            Log.d("Lista de Frutas", it.toString())
        }

        viewModel.getListaFrutasLiveData()?.observe(this, frutasObserver)

    }

}

