package com.example.mvvmpractice3

import android.view.View

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClick(view: View,student: NamesViewModel.Student)
}