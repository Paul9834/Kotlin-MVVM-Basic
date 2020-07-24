package com.paul9834.learn_kotlin.view.repolist

import androidx.lifecycle.MutableLiveData
import com.paul9834.learn_kotlin.model.FrutasRepository
import com.paul9834.learn_kotlin.view.base.BaseViewModel
import com.paul9834.learn_kotlin.model.Fruit

class RepoListViewModel: BaseViewModel() {

    val repoListLive = MutableLiveData<List<Fruit>>()

    fun fetchRepoList() {
        dataLoading.value = true
        FrutasRepository.getInstance().getFruitList { isSuccess, response ->
            dataLoading.value = false
            if (isSuccess) {
                repoListLive.value = response?.items
                empty.value = false
            } else {
                empty.value = true
            }
        }
    }

}