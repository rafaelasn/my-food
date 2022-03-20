package com.example.myfood.restaurantmenu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RestaurantMenuViewModel @Inject constructor(
    val repo: RestaurantMenuRepository
) : ViewModel() {
}
