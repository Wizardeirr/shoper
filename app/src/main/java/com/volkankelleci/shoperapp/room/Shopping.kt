package com.volkankelleci.shoperapp.room

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity
data class Shopping(

    val shopItem:String,
    val count:Int,
    val date:String,
){
    @PrimaryKey(autoGenerate = true)
    val uuid:Int=0
}
