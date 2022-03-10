package com.example.myfood.restaurantfeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myfood.databinding.FragmentRestaurantMenuBinding

class RestaurantMenuFragment : Fragment() {

    private lateinit var binding: FragmentRestaurantMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRestaurantMenuBinding.inflate(inflater, container, false)
        return binding.root
    }
}
