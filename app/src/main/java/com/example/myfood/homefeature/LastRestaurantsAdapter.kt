package com.example.myfood.homefeature

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myfood.databinding.ItemLastRestaurantBinding
import com.example.myfood.model.Restaurant

class LastRestaurantsAdapter :
    ListAdapter<Restaurant, LastRestaurantsAdapter.ViewHolder>(RecommendedDiffCallback()) {

    override fun submitList(list: MutableList<Restaurant>?) {
        super.submitList(list?.let { ArrayList(it) })
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemLastRestaurantBinding =
            ItemLastRestaurantBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding, parent.context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(val binding: ItemLastRestaurantBinding, val context: Context) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(restaurant: Restaurant) {
            with(binding) {
                lastRestaurantNameTextView.text = restaurant.name
            }
        }
    }
}

class RecommendedDiffCallback : DiffUtil.ItemCallback<Restaurant>() {
    override fun areItemsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Restaurant, newItem: Restaurant): Boolean {
        return areItemsTheSame(oldItem, newItem)
    }
}
