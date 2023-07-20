package com.jyldyzferr.ecommerceapp.presentation.home_screen.view_pager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.databinding.ItemRecomendationEventBinding
import com.jyldyzferr.ecommerceapp.domain.models.RecommendationsEvent

class ViewPagerAdapter: RecyclerView.Adapter<ViewPagerViewHolder>() {
    private val events = mutableListOf<RecommendationsEvent>()

    fun updateData(newList: List<RecommendationsEvent>){
        events.clear()
        events.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_recomendation_event, parent, false)
        val binding = ItemRecomendationEventBinding.bind(view)
        return ViewPagerViewHolder(binding)
    }

    override fun getItemCount(): Int = events.size

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        holder.bind (events[position])
    }

}