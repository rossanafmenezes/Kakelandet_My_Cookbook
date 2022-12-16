package com.example.kakelandet_mycookbook

import androidx.lifecycle.ViewModel

class RecipeListViewModel : ViewModel() {
    private val initialRecipesList = recipeList()


    fun getRecipesList(): List<Recipe> {
        return initialRecipesList
    }
}