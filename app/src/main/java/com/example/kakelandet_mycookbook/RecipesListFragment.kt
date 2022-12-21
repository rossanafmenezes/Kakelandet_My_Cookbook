package com.example.kakelandet_mycookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakelandet_mycookbook.databinding.FragmentRecipesListBinding

class RecipesListFragment : Fragment() {
    val viewModel: RecipeListViewModel by viewModels()

    private var _binding: FragmentRecipesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRecipesListBinding.inflate(inflater, container, false)

        binding.recipesListRv.adapter = RecipeListAdapter(viewModel.getRecipesList())
        binding.recipesListRv.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}