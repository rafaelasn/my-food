package com.example.myfood.restaurantmenu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.myfood.databinding.FragmentRestaurantMenuBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RestaurantMenuFragment : Fragment() {

    private val viewModel by viewModels<RestaurantMenuViewModel>()
    private lateinit var binding: FragmentRestaurantMenuBinding
    val args: RestaurantMenuFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRestaurantMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    private fun bindView() {
        binding.testTv.text = viewModel.teste
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindView()
    }
}
