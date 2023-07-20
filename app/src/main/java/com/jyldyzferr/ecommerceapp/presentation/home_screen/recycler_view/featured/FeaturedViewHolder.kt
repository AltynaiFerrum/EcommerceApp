package com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.featured

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jyldyzferr.ecommerceapp.databinding.ItemCategoryBinding
import com.jyldyzferr.ecommerceapp.databinding.ItemFeaturedBinding
import com.jyldyzferr.ecommerceapp.domain.models.Featured
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory

class FeaturedViewHolder(
    private val binding: ItemFeaturedBinding
): RecyclerView.ViewHolder(binding.root) {

    fun bind(featured: Featured) = with (binding) {
        titleTextViewFeatured.text = featured.title
        priceTextViewFeatured.text = featured.price

        loadImageByUrl(
            imageUrl = featured.imageUrl,
            imageView = itemFeatured
        )

    }

    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}