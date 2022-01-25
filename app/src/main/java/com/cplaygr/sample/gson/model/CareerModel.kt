package com.cplaygr.sample.gson.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CareerModel(
    @SerializedName(value = "position")
    @Expose
    val position: String,

    @SerializedName(value = "year")
    @Expose
    val year: Int
)
