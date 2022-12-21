package com.example.kakelandet_mycookbook

import androidx.lifecycle.ViewModel

class IngredientListViewModel: ViewModel() {
    private val initiateIngredientList = ingredientList()

    fun getIngredientList(): List<Ingredient> {
        return initiateIngredientList
    }
}