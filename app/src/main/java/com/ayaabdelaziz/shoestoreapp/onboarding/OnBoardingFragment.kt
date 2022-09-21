package com.ayaabdelaziz.shoestoreapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ayaabdelaziz.shoestoreapp.R
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentLoginBinding
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentWelcomeBinding


class OnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentWelcomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWelcomeBinding.inflate(inflater,container,false)

        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingFragment_to_instructionsFragment)
        }
        return binding.root
    }


}