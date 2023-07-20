package com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jyldyzferr.ecommerceapp.databinding.ItemRecomendationEventBinding
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent

class ViewPagerViewHolder(
    private val binding: ItemRecomendationEventBinding
): RecyclerView.ViewHolder(binding.root){

    fun bind (event: RecommendationsEvent) = with(binding) {
        titleTextView.text = event.title

        Glide.with(root.context)
            .load(event.imageUrl)
            .into(imageView)
    }
}