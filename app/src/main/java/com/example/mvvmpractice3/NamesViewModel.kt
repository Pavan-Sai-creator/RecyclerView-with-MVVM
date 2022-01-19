package com.example.mvvmpractice3

import androidx.lifecycle.ViewModel

class NamesViewModel: ViewModel() {
    val names = mutableListOf<Student>(
        Student("Pavan",0),
        Student("Aayush",0),
        Student("Shivansh",0),
        Student("Subhojeeth",0),
        Student("Rajesh",0),
        Student("Jessi",0),
        Student("Naveen",0),
        Student("Prashanth",0),
        Student("Yashwanth",0),
        Student("Sathvik",0),
        Student("Pavan",0),
        Student("Aayush",0),
        Student("Shivansh",0),
        Student("Subhojeeth",0),
        Student("Rajesh",0),
        Student("Jessi",0),
        Student("Naveen",0),
        Student("Prashanth",0),
        Student("Yashwanth",0),
        Student("Sathvik",0)

    )

    fun increase_score(student:Student)
    {
        student.score = student.score.plus(1)
    }
    fun decrease_score(student:Student)
    {
        student.score = student.score.minus(1)
    }

    data class Student(
        var name:String,
        var score:Int
    )
}