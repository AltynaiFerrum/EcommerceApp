package com.jyldyzferr.ecommerceapp.presentation.search_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.SearchView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.data.fake_data.FakeData
import com.jyldyzferr.ecommerceapp.databinding.FragmentSearchScreenBinding
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategories
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.presentation.home_screen.setupSearchViewParams
import com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager.FragmentHomeScreenViewModel
import com.jyldyzferr.ecommerceapp.presentation.search_screen.item_category.ItemCategoryAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentSearchScreen : Fragment(),SearchView.OnQueryTextListener {

    private val binding: FragmentSearchScreenBinding by lazy {
        FragmentSearchScreenBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentSearchScreenViewModel by viewModels()

    private val categoryAdapter: ItemCategoryAdapter by lazy {
        ItemCategoryAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        observeData()
    }

    private fun initViews() = with(binding) {
        mainContentSearchScreen.itemCategoryRecyclerView.adapter = categoryAdapter
        mainTopContentSearchScreen.searchViewSearchScreen.setOnQueryTextListener(
          this@FragmentSearchScreen
        )
    }

    private fun observeData() {
        viewModel.allCategoryFlow.onEach {
            categoryAdapter.updateList(it)
        }.launchIn(lifecycleScope)
    }

    override fun onQueryTextSubmit(
        query: String?
    ): Boolean {
        val searchString = query ?: return false
        startSearch(searchString)
        return false
    }


    override fun onQueryTextChange(
        query: String?
    ): Boolean {
        val searchString = query ?: return false
        startSearch(searchString)
        return false
    }

    private fun startSearch(
        query: String
    ) {
        if (query.isBlank()){
            categoryAdapter.updateList(viewModel.allCategoryFlow.value)
            return
    }

        val sortedNoteList = viewModel.allCategoryFlow.value.filter {
            val isSort = it.title.contains(query, ignoreCase = true)
            isSort
        }
        categoryAdapter.updateList(sortedNoteList)
    }
}


fun android.widget.SearchView.setupSearchViewParams() {
    val searchText = this.findViewById<View>(
        this.context.resources.getIdentifier(
            "android:id/search_src_text", null, null
        )
    ) as AutoCompleteTextView
    searchText.setTextSize(
        TypedValue.COMPLEX_UNIT_PX,
        resources.getDimensionPixelSize(R.dimen.textSizeForSmallTexts).toFloat()
    )
    val typeface = ResourcesCompat.getFont(this.context, R.font.inter_semibold)
    searchText.typeface = typeface
}