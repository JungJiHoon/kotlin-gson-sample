package com.cplaygr.sample.gson.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DramaModel(
    @SerializedName(value = "drama_title")
    @Expose
    val dramaTitle: String,

    @SerializedName(value = "drama_season")
    @Expose
    val dramaSeason: String,

    @SerializedName(value = "company_list")
    @Expose
    val companyList: ArrayList<CompanyListModel>
)
