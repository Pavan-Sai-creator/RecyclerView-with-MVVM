package com.example.mvvmpractice3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class namesAdapter(
    private val context: Context,
    private val listener: RecyclerViewClickListener,
    private val dataset: MutableList<NamesViewModel.Student>
):RecyclerView.Adapter<namesAdapter.namesViewHolder>(){



    class namesViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var student_name: TextView = view.findViewById(R.id.name_tv)
        var student_score:TextView = view.findViewById(R.id.itemScore_tv)
        var increase_score_btn: ImageView = view.findViewById(R.id.up_btn)
        var decrease_score_btn:ImageView = view.findViewById(R.id.down_btn)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): namesAdapter.namesViewHolder {
        var inflatedItemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        return namesViewHolder(inflatedItemView)
    }

    override fun onBindViewHolder(holder: namesAdapter.namesViewHolder, position: Int) {
        var current_student = dataset[position]
        holder.student_name.text = current_student.name.toString()
        holder.student_score.text = current_student.score.toString()
        holder.student_name.setOnClickListener {
            listener.onRecyclerViewItemClick(holder.student_name,current_student)
        }
        holder.increase_score_btn.setOnClickListener {
            listener.onRecyclerViewItemClick(holder.increase_score_btn,current_student)
            holder.student_score.text = current_student.score.toString()
        }
        holder.decrease_score_btn.setOnClickListener {
            listener.onRecyclerViewItemClick(holder.decrease_score_btn,current_student)
            holder.student_score.text = current_student.score.toString()
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}