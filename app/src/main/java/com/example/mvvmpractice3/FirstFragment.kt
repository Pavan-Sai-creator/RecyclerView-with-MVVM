package com.example.mvvmpractice3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.mvvmpractice3.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var viewModel: FirstViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater,R.layout.fragment_first,container,false)
        viewModel = ViewModelProviders.of(this).get(FirstViewModel::class.java)
        binding.firstViewModel = viewModel
        binding.lifecycleOwner = this
        binding.getNamesBtn.setOnClickListener {
            findNavController().navigate(R.id.action_firstFragment_to_namesFragment)
        }




        return binding.root
    }

}