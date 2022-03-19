package com.example.myfood.homefeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfood.databinding.FragmentHomeBinding
import com.example.myfood.model.Restaurant

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var restaurantList = mutableListOf<Restaurant>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        populateRestaurantList()
        setupRecyclerViews()
        bindView()
    }

    private fun setupRecyclerViews() {
        setupLastRestaurantsAdapter()
        setupRecommendedRestaurantsAdapter()
    }

    private fun setupLastRestaurantsAdapter() {
        val adapter = LastRestaurantsAdapter()
        with(binding.lastRestaurantsRecyclerView) {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
            this.adapter = adapter
        }
        adapter.submitList(restaurantList)
    }

    private fun setupRecommendedRestaurantsAdapter() {
        val adapter = RecommendedRestaurantsAdapter()
        with(binding.recommendedRestaurantsRecyclerView) {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            this.adapter = adapter
        }
        adapter.submitList(restaurantList)
    }

    private fun bindView() {
    }

    private fun populateRestaurantList() {
        restaurantList.addAll(
            listOf(
                Restaurant("001", "BurgerKing", 4f),
                Restaurant("002", "McDonalds", 4f),
                Restaurant("003", "Bobs", 5f),
                Restaurant("004", "Madero", 4f),
                Restaurant("005", "Pizza 10", 4f),
                Restaurant("006", "Pastelaria", 4f),
                Restaurant("007", "Açaí da Hora", 5f)
            )
        )
    }
}
