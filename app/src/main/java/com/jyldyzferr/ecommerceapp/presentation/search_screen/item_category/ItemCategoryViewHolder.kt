package com.jyldyzferr.ecommerceapp.presentation.search_screen.item_category

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jyldyzferr.ecommerceapp.databinding.ItemCategoryBinding
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.listeners.SearchViewOnClickListeners


class ItemCategoryViewHolder(
    private val binding: ItemCategoryBinding,
): RecyclerView.ViewHolder(binding.root) {

    fun bind(category: ItemCategory) = with(binding) {
        titleTextViewCategory.text = category.title

        loadImageByUrl(
            imageUrl = category.imageUrl,
            imageView = itemCategory
        )
    }

    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}

