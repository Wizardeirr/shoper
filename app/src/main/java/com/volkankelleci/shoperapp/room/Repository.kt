package com.volkankelleci.shoperapp.room

class Repository (
    private val db:ShoppingDatabase
        ){
    suspend fun upsert(item:Shopping)=db.shoppingDao().upsert(item)
    suspend fun delete(item: Shopping)=db.shoppingDao().delete(item)
    fun getAllShoppingItems()=db.shoppingDao().getAllCountries()


}