package com.ayaabdelaziz.shoestoreapp.onboarding

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.ayaabdelaziz.shoestoreapp.R
import com.ayaabdelaziz.shoestoreapp.databinding.FragmentShoeListBinding
import com.ayaabdelaziz.shoestoreapp.databinding.ShoeItemBinding


class ShoeListFragment : Fragment() {

    private lateinit var binding: FragmentShoeListBinding
    val sharedViewModel by activityViewModels<SharedViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentShoeListBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        binding.lifecycleOwner = this
        binding.btnShoelist.setOnClickListener {
            findNavController().navigate(R.id.action_shoeListFragment_to_addShoesFragment)
        }
        sharedViewModel.livedata.observe(viewLifecycleOwner) {
            for (i in it) {
                val shoeItemBinding = ShoeItemBinding.inflate(layoutInflater, container, false)
                shoeItemBinding.shoselist = i
                binding.linear.addView(shoeItemBinding.root)
            }
        }
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.my_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logout -> findNavController().navigate(R.id.loginFragment)
        }
        return super.onOptionsItemSelected(item)
    }


}