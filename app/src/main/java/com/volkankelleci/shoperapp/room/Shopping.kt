package com.volkankelleci.shoperapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("shopping")
data class Shopping(

   var shopItem:String,
   var count:Int,
   var date:String,
){
    @PrimaryKey(autoGenerate = true)
    var uuid:Int = 0
}