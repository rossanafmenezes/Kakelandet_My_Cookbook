package com.example.kakelandet_mycookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakelandet_mycookbook.databinding.FragmentIngredientsListBinding

class IngredientsListFragment : Fragment() {
    private val viewModel: IngredientListViewModel by viewModels()

    private var _binding : FragmentIngredientsListBinding? = null
    private val binding get() = _binding!!

    private lateinit var ingredientList: List<Ingredient>

    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ingredientList = viewModel.getIngredientList()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIngredientsListBinding.inflate(inflater, container, false)

        binding.ingredientsRv.adapter = IngredientListAdapter(ingredientList)
        binding.ingredientsRv.layoutManager = LinearLayoutManager(requireContext())

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}