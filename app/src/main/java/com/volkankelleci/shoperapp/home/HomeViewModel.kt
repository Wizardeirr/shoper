package com.volkankelleci.shoperapp.home

import androidx.lifecycle.ViewModel
import com.volkankelleci.shoperapp.room.Repository
import com.volkankelleci.shoperapp.room.Shopping
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: Repository
) : ViewModel() {

    fun upsert(item:Shopping)= CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(item)
    }
    fun delete(item: Shopping)= CoroutineScope(Dispatchers.Main).launch {
        repository.delete(item)
    }
    fun getAllShoppingItems()=repository.getAllShoppingItems()
}