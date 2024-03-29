package com.example.tasty.model.remote.searchResponse


import com.google.gson.annotations.SerializedName

data class ResultSearchModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("title")
    val title: String
)