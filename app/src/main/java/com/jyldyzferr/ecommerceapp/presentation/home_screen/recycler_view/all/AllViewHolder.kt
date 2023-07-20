package com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.all

import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jyldyzferr.ecommerceapp.databinding.ItemAllBinding
import com.jyldyzferr.ecommerceapp.domain.models.All
import com.jyldyzferr.ecommerceapp.domain.models.Featured

class AllViewHolder(
    private val binding: ItemAllBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(all: All) = with (binding) {
        titleTextViewAll.text = all.title
        descriptionTextViewAll.text = all.description
        priceTextViewAll.text = all.price

        loadImageByUrl(
            imageUrl = all.imageUrl,
            imageView = itemAll
        )

    }

    private fun loadImageByUrl(imageUrl: String, imageView: ImageView) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .into(imageView)
    }
}