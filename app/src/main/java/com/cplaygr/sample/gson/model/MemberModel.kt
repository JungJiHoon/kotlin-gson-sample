package com.cplaygr.sample.gson.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class MemberModel(
    @SerializedName(value = "name")
    @Expose
    val name: String,

    @SerializedName(value = "age")
    @Expose
    val age: Int,

    @SerializedName(value = "career")
    @Expose
    val careerMap: Map<String, String>
)
