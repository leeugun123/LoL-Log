package com.example.riotapi.Data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "userInfo_table")
data class UserInfo(

    @SerializedName("id")
    val id : String,

    @SerializedName("accountId")
    val accountId : String,

    @SerializedName("puuid")
    val puuId : String,

    @SerializedName("name")
    val name : String,

    @SerializedName("profileIconId")
    val profileIconId : Long,

    @SerializedName("revisionDate")
    val revisionDate : Long,

    @SerializedName("summonerLevel")
    val summonerLevel : Long

){
    @PrimaryKey(autoGenerate = true)
    var pId : Int = 0
}