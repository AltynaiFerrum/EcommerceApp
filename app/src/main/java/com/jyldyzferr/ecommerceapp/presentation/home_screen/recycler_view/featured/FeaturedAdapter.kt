package com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.featured

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.databinding.ItemCategoryBinding
import com.jyldyzferr.ecommerceapp.databinding.ItemFeaturedBinding
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.presentation.search_screen.item_category.ItemCategoryViewHolder

class FeaturedAdapter:RecyclerView.Adapter<FeaturedViewHolder>() {

    private val featured = mutableListOf<Featured>()

    fun updateData(newList: List<Featured>){
        featured.clear()
        featured.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeaturedViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_featured, parent, false)
        val binding = ItemFeaturedBinding.bind(view)
        return FeaturedViewHolder(binding)
    }

    override fun getItemCount(): Int = featured.size

    override fun onBindViewHolder(holder: FeaturedViewHolder, position: Int) {
        holder.bind(featured[position])

    }

}