package com.example.kakelandet_mycookbook

import androidx.annotation.DrawableRes

data class RecipeListItem(
    @DrawableRes val image: Int?,
    @DrawableRes val timeIcon: Int,
    @DrawableRes val servingIcon: Int,
    val id: Long,
    val title: String,
    val description: String,
    val time: String,
    val serving: String,
)