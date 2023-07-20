package com.jyldyzferr.ecommerceapp.domain.use_cases

import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository

class FetchAllFeatured (
    private val repository: ItemRepository
) {
    operator fun invoke(): List<Featured> {
        return repository.fetchAllFeatured()

    }
}
