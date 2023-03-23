package com.volkankelleci.shoperapp.room

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(item:Shopping)
    @Delete
    suspend fun delete(item: Shopping)
    @Query("SELECT * FROM shopping")
    fun getAllCountries():LiveData<List<Shopping>>



}
