package com.jyldyzferr.ecommerceapp.data.repositories

import com.jyldyzferr.ecommerceapp.data.fake_data.FakeData
import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository

class ItemRepositoryImpl: ItemRepository{

    override fun fetchAllRecommendationsEvent(
    ): List<RecommendationsEvent> {
        return FakeData.fakeRecommendationsEvent()
    }

    override fun fetchAllItemCategories(): List<ItemCategory> {
        return FakeData.fakeItemCategory()
    }

    override fun fetchAllFeatured(): List<Featured> {
        return FakeData.fakeFeatured()
    }

    override fun fetchAll(): List<All> {
        return FakeData.fakeAll()
    }
}