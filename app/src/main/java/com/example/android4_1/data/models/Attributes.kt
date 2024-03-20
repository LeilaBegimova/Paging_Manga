package com.example.android4_1.data.models

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("posterImage")
    val posterImage: PosterImage
)