package com.paul9834.learn_kotlin.view.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.paul9834.learn_kotlin.R
import com.paul9834.learn_kotlin.model.Fruit
import com.paul9834.learn_kotlin.view.repolist.RepoListViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: RepoListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewModel = ViewModelProvider(this).get(RepoListViewModel::class.java)

        val frutasObserver = Observer<List<Fruit>> {
            Log.d("Lista de Frutas", it.toString())

        }

        viewModel.repoListLive.observe(this, frutasObserver)

        viewModel.fetchRepoList()

    }

}

