package com.volkankelleci.shoperapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Shopping::class], version = 1)
abstract class ShoppingDatabase:RoomDatabase() {
    abstract fun shoppingDao(): ShoppingDao
    companion object{
        @Volatile
        private var instance:ShoppingDatabase?=null
        private val LOCK=Any()

        operator fun invoke(context: Context)=instance?: synchronized(LOCK){
           instance?: makeDataBase(context).also {  }
        }
        private fun makeDataBase(context: Context){
         Room.databaseBuilder(
             context.applicationContext,
             ShoppingDatabase::class.java,
             "shop")
             .build()
        }
    }
}