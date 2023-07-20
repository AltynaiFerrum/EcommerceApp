package com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.listeners

import com.jyldyzferr.ecommerceapp.domain.models.ItemCategories
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory

interface SearchViewOnClickListeners {

    fun onSearchViewClick(itemCategories: ItemCategories)

}