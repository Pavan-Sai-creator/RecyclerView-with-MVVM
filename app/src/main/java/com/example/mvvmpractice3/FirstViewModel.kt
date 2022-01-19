package com.example.mvvmpractice3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel: ViewModel() {
    private val _score = MutableLiveData<Int>()
            val score : LiveData<Int>
            get() = _score

    fun increaseScore(){
        _score.value = _score.value?.plus(1)
    }
    init {
        _score.value=0
    }
}