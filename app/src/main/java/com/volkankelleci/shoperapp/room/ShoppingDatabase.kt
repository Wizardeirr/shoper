package com.volkankelleci.shoperapp.room

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Shopping::class], version = 1)
abstract class ShoppingDatabase:RoomDatabase() {
    abstract fun shoppingDao(): ShoppingDao

}