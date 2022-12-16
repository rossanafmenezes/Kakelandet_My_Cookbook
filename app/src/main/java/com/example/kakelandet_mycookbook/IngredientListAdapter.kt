package com.example.kakelandet_mycookbook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kakelandet_mycookbook.databinding.IngredientListItemBinding

class IngredientListAdapter(
    private var ingredientList: List<Ingredient>
): RecyclerView.Adapter<IngredientListAdapter.IngredientListViewHolder>() {

    inner class IngredientListViewHolder(val binding: IngredientListItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientListViewHolder {
        val binding = IngredientListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return IngredientListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: IngredientListViewHolder, position: Int) {
        with(holder) {
            with(ingredientList[position]) {
                binding.ingredientTitle.text = this.title
                binding.priceTextview.text = this.price.toString()
                binding.quantityTextview.text = this.quantity.toString()
            }
        }
    }

    override fun getItemCount(): Int {
        return ingredientList.size
    }

}