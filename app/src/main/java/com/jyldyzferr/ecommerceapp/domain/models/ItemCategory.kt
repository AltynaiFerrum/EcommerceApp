package com.jyldyzferr.ecommerceapp.domain.models

import java.io.Serializable

data class ItemCategory(
    val id: String,
    val title: String,
    val imageUrl: String
) : Serializable