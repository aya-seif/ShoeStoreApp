package com.ayaabdelaziz.shoestoreapp.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ayaabdelaziz.shoestoreapp.R
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {


    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginbtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_onBoardingFragment)
        }

        binding.signUp.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_onBoardingFragment)
        }


        return binding.root
    }


}