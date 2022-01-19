package com.example.mvvmpractice3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.example.mvvmpractice3.databinding.FragmentNamesBinding


class NamesFragment : Fragment(),RecyclerViewClickListener {
    private lateinit var viewModel: NamesViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentNamesBinding>(inflater,R.layout.fragment_names,container,false)
        viewModel = ViewModelProviders.of(this).get(NamesViewModel::class.java)
        binding.namesViewModel=viewModel
        binding.lifecycleOwner=this
        binding.myRecyclerView.adapter = this.context?.let { namesAdapter(it,this,viewModel.names) }
        binding.myRecyclerView.setHasFixedSize(true)

        binding.nextBtn.setOnClickListener {
            findNavController().navigate(NamesFragmentDirections.actionNamesFragmentToTestFragment(viewModel.names[0].name,viewModel.names[0].score))
        }

        return binding.root
    }

    override fun onRecyclerViewItemClick(view: View, student: NamesViewModel.Student) {
        when(view.id)
        {
            R.id.name_tv -> {
                Toast.makeText(requireContext(),"${student.name} clicked.",Toast.LENGTH_SHORT).show()
            }
            R.id.up_btn -> {
                viewModel.increase_score(student)
            }
            R.id.down_btn -> {
                viewModel.decrease_score(student)
            }
        }
    }


}