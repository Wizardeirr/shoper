package com.volkankelleci.shoperapp.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ShoppingDao {
    @Query("SELECT * FROM user")
    fun getAll(): List<Shopping>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<Shopping>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Shopping

    @Insert
    fun insertAll(vararg users: Shopping)

    @Delete
    fun delete(user: Shopping)
}
