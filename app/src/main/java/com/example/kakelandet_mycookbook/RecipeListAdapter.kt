package com.example.kakelandet_mycookbook

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kakelandet_mycookbook.databinding.RecipesListItemBinding

class RecipeListAdapter(
    private var recipeList: List<Recipe>,
) : RecyclerView.Adapter<RecipeListAdapter.RecipeListViewHolder>() {

    inner class RecipeListViewHolder(val binding: RecipesListItemBinding) :
            RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeListViewHolder {
        val binding = RecipesListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return RecipeListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecipeListViewHolder, position: Int) {
        with(holder){
            with(recipeList[position]) {
                if(this.image != null) {
                    binding.recipeImageView.setImageResource(this.image)
                } else {
                    binding.recipeImageView.setImageResource(R.drawable.logo_kakeland)
                }
                binding.recipeTitleTextView.text = this.title
                binding.recipeDescriptionTextView.text = this.description
                binding.servesTextView.text = this.serving
                binding.icServersImageView.setImageResource(this.servingIcon)
                binding.prepTimeTextView.text = this.time
                binding.icClockImageView.setImageResource(this.timeIcon)
            }
        }
    }

    override fun getItemCount(): Int {
      return  recipeList.size
    }
}