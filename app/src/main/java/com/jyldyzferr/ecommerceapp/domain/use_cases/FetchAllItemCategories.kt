package com.jyldyzferr.ecommerceapp.domain.use_cases

import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository

class FetchAllItemCategories(
    private val repository: ItemRepository
) {
    operator fun invoke(): List<ItemCategory> {
        return repository.fetchAllItemCategories()

    }
}