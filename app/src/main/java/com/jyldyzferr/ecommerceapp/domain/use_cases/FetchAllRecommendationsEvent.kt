package com.jyldyzferr.ecommerceapp.domain.use_cases

import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository

class FetchAllRecommendationsEvent(
    private val repository: ItemRepository
) {
    operator fun invoke(): List<RecommendationsEvent> {
        return repository.fetchAllRecommendationsEvent()

    }
}