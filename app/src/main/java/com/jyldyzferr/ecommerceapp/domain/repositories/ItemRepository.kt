package com.jyldyzferr.ecommerceapp.domain.repositories

import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent

interface ItemRepository {

    fun  fetchAllRecommendationsEvent(): List<RecommendationsEvent>

    fun fetchAllItemCategories(): List<ItemCategory>

    fun fetchAllFeatured(): List<Featured>

    fun fetchAll(): List<All>


}