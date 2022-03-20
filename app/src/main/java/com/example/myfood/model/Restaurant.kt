package com.example.myfood.model

import java.io.Serializable

data class Restaurant(
    val id: String,
    val name: String,
    val rating: Float
) : Serializable
