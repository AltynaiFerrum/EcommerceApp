package com.jyldyzferr.ecommerceapp.presentation.home_screen.recycler_view.all

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.jyldyzferr.ecommerceapp.R
import com.jyldyzferr.ecommerceapp.databinding.ItemAllBinding
import com.jyldyzferr.ecommerceapp.domain.models.All

class AllAdapter: RecyclerView.Adapter<AllViewHolder>() {

    private val all = mutableListOf<All>()

    fun updateData(newList: List<All>){
        all.clear()
        all.addAll(newList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_all, parent, false)
        val binding = ItemAllBinding.bind(view)
        return AllViewHolder(binding)
    }

    override fun getItemCount(): Int = all.size

    override fun onBindViewHolder(holder: AllViewHolder, position: Int) {
        holder.bind(all[position])
    }


}