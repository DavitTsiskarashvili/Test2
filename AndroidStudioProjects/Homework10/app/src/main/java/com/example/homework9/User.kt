package com.example.homework9

import android.media.Image
import androidx.annotation.DrawableRes

data class Categories (
    var id: String,
    var text: String,
    var color: Int,
)


data class Products (
    var allCategory: String,
    var categoryType: String,
    var image: Int,
    var description: String,
    var price: String,
)