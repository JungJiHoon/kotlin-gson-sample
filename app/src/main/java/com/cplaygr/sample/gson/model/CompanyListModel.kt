package com.cplaygr.sample.gson.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CompanyListModel(
    @SerializedName(value = "name")
    @Expose
    val name: String,

    @SerializedName(value = "member_list")
    @Expose
    val memberList: ArrayList<MemberModel>
)
