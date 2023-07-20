package com.jyldyzferr.ecommerceapp.domain.use_cases

import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository

class FetchAll(
    private val repository: ItemRepository
) {
    operator fun invoke(): List<All>{
        return repository.fetchAll()
    }
}