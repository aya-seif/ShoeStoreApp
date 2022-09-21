package com.ayaabdelaziz.shoestoreapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ayaabdelaziz.shoestoreapp.R
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    private lateinit var binding : FragmentInstructionsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentInstructionsBinding.inflate(inflater, container, false)
        binding.btnInstruction.setOnClickListener {
            findNavController().navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }
        return binding.root
    }


}