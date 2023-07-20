package com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager

import androidx.lifecycle.ViewModel
import com.jyldyzferr.ecommerceapp.data.repositories.ItemRepositoryImpl
import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent
import com.jyldyzferr.ecommerceapp.domain.repositories.ItemRepository
import com.jyldyzferr.ecommerceapp.domain.use_cases.FetchAll
import com.jyldyzferr.ecommerceapp.domain.use_cases.FetchAllFeatured
import com.jyldyzferr.ecommerceapp.domain.use_cases.FetchAllItemCategories
import com.jyldyzferr.ecommerceapp.domain.use_cases.FetchAllRecommendationsEvent
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


data class MainFragmentUiState(
    val recommendationsEvent: List<RecommendationsEvent> = emptyList(),
    val featured: List<Featured> = emptyList(),
    val all: List<All> = emptyList()
)

class FragmentHomeScreenViewModel : ViewModel() {

    private val itemRepository: ItemRepository = ItemRepositoryImpl()


    private val fetchAllRecommendationsEvent = FetchAllRecommendationsEvent(itemRepository)
    private val fetchAllFeatured = FetchAllFeatured(itemRepository)
    private val fetchAllI = FetchAll(itemRepository)

    private val _uiStateFlow = MutableStateFlow(MainFragmentUiState())
    val uiStateFlow = _uiStateFlow.asStateFlow()

    init {
        val recommendationsEvent = fetchAllRecommendationsEvent.invoke()
        val featured = fetchAllFeatured.invoke()
        val all = fetchAllI.invoke()
        val uiState = MainFragmentUiState(
            recommendationsEvent = recommendationsEvent,
            featured = featured,
            all = all
        )
        _uiStateFlow.tryEmit(uiState)
    }

}