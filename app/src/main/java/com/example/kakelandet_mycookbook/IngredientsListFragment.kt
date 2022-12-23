package com.example.kakelandet_mycookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kakelandet_mycookbook.databinding.FragmentIngredientsListBinding

class IngredientsListFragment : Fragment() {
    private val viewModel: IngredientListViewModel by viewModels()

    private var _binding : FragmentIngredientsListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentIngredientsListBinding.inflate(inflater, container, false)

        binding.ingredientsRv.adapter = IngredientListAdapter(viewModel.getIngredientList())
        binding.ingredientsRv.layoutManager = LinearLayoutManager(requireContext())
        binding.addIngredientFab.setOnClickListener{
            findNavController().navigate(
                R.id.action_ingredientsListFragment_to_addIngredientFragment
            )
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}