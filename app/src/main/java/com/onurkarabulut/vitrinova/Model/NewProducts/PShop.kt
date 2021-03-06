package com.onurkarabulut.vitrinova.Model.NewProducts

import com.google.gson.annotations.SerializedName

class PShop(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("definition")
    val definition: String?
) {
}