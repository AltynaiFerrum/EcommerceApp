package com.jyldyzferr.ecommerceapp.presentation.search_screen.item_category

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.databinding.ItemCategoryBinding
import com.jyldyzferr.ecommerceapp.domain.models.ItemCategory
import com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.listeners.SearchViewOnClickListeners

class ItemCategoryAdapter(
): RecyclerView.Adapter<ItemCategoryViewHolder> (){

    private val categories = mutableListOf<ItemCategory>()

    fun updateList(newList: List<ItemCategory>){
        categories.clear()
        categories.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemCategoryViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_category, parent, false)
        val binding = ItemCategoryBinding.bind(view)
        return ItemCategoryViewHolder(binding)
    }

    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(holder: ItemCategoryViewHolder, position: Int) {
        holder.bind(categories[position])
    }

}