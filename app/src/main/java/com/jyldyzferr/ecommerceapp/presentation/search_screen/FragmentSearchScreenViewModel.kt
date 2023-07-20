package com.jyldyzferr.ecommerceapp.presentation.search_screen

import androidx.lifecycle.ViewModel
import com.jyldyzferr.ecommerceapp.data.repositories.ItemRepositoryImpl
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategories
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository
import com.jyldyzferr.ecommerceapp.domain.use_cases.FetchAllItemCategories
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import java.util.Locale.Category

class FragmentSearchScreenViewModel : ViewModel() {

    private val repositories: ItemRepository = ItemRepositoryImpl()
    private val fetchAllItemCategories = FetchAllItemCategories(repositories)

    private val _allCategoryFlow = MutableStateFlow<List<ItemCategory>>(emptyList())
    val allCategoryFlow = _allCategoryFlow.asStateFlow()

    init {
        val category = fetchAllItemCategories.invoke()
        _allCategoryFlow.tryEmit(category)
    }
}