package com.jyldyzferr.ecommerceapp.presentation.home_screen

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import android.util.TypedValue
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowInsets.Side.all
import android.widget.AutoCompleteTextView
import androidx.core.content.res.ResourcesCompat
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.databinding.FragmentHomeScreenBinding
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategories
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.all.AllAdapter
import com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.featured.FeaturedAdapter
import com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.listeners.SearchViewOnClickListeners
import com.jyldyzferr.ecommerceapp.presentation.search_screen.item_category.ItemCategoryAdapter
import com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager.FragmentHomeScreenViewModel
import com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager.ViewPagerAdapter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class FragmentHomeScreen : Fragment(), SearchViewOnClickListeners {

    private val binding: FragmentHomeScreenBinding by lazy {
        FragmentHomeScreenBinding.inflate(layoutInflater)
    }

    private val viewModel: FragmentHomeScreenViewModel by viewModels()

    private val viewPagerAdapter: ViewPagerAdapter by lazy {
        ViewPagerAdapter()
    }

    private val featuredAdapter: FeaturedAdapter by lazy {
        FeaturedAdapter()
    }

    private val allAdapter: AllAdapter by lazy {
        AllAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View = binding.root


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.mainContentHomeScreen.searchViewHomeScreen.setOnClickListener() {
            findNavController().navigate(R.id.action_fragmentHomeScreen_to_fragmentSearchScreen)
        }
        initViews()
        setupSearchView()
        observeData()
    }

    private fun initViews() = with(binding){
        mainContentHomeScreen.viewPager.adapter = viewPagerAdapter
        mainContentHomeScreen.featuredCategoryRecyclerView.adapter= featuredAdapter
        mainContentHomeScreen.allCategoryRecyclerView.adapter= allAdapter
    }

    private fun setupSearchView() {
        binding.mainContentHomeScreen.searchViewHomeScreen.setupSearchViewParams()
    }

    private fun observeData() {
        viewModel.uiStateFlow.onEach {uiState ->
            Log.i("Joseph","uiState = = ${uiState.featured.size}")
            viewPagerAdapter.updateData(uiState.recommendationsEvent)
            featuredAdapter.updateData(uiState.featured)
            allAdapter.updateData(uiState.all)
        }.launchIn(lifecycleScope)
    }

    override fun onSearchViewClick(itemCategories: ItemCategories) {
       // binding.mainContentHomeScreen.searchViewHomeScreen.setOnClickListener() {
         //   findNavController().navigate(R.id.action_fragmentHomeScreen_to_fragmentSearchScreen)
      //  }

           // .navigate(FragmentHomeScreenDirections.actionFragmentHomeScreenToFragmentSearchScreen(itemCategories))
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
