package com.example.kakelandet_mycookbook

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.kakelandet_mycookbook.databinding.FragmentAddIngredientBinding


class AddIngredientFragment : Fragment() {
    private val viewModel: AddIngredientViewModel by viewModels()

    private var _binding : FragmentAddIngredientBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddIngredientBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addIngredientLabel.text = getString(R.string.ingredient_name_label)
        binding.editTextIngredientName
        binding.addIngredientButton.setOnClickListener {
            TODO()
        }
    }
}