package com.example.mvvmpractice3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.mvvmpractice3.databinding.FragmentTestBinding

class TestFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentTestBinding>(inflater,R.layout.fragment_test,container,false)
        val testFragmentArgs by navArgs<TestFragmentArgs>()
        binding.reportNameTv.text = testFragmentArgs.studentName
        binding.reportScoreTv.text = testFragmentArgs.studentScore.toString()

        return binding.root
    }


}