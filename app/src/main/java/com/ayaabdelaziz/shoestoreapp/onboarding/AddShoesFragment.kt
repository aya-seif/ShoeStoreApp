package com.ayaabdelaziz.shoestoreapp.onboarding

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.ayaabdelaziz.shoestoreapp.R
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentAddShoesBinding


class AddShoesFragment : Fragment() {
    private lateinit var binding: FragmentAddShoesBinding
    val sharedViewModel by activityViewModels<SharedViewModel>()
    var shoseobJ = Shoe()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAddShoesBinding.inflate(inflater, container, false)
        binding.shoe = shoseobJ

        binding.addBtn.setOnClickListener {
            sharedViewModel.addShoe(shoseobJ)
            findNavController().navigateUp()
            Toast.makeText(requireContext(), "Saved Succesfully", Toast.LENGTH_SHORT).show()
            Log.d("name", "onCreateView:${shoseobJ.shoeName} ")
        }
        return binding.root
    }


}