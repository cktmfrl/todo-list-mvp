package com.example.todo_list_mvp.main.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.todo_list_mvp.R
import com.example.todo_list_mvp.databinding.ItemTodoBinding
import com.example.todo_list_mvp.model.Todo

class TodoViewHolder(
    parent: ViewGroup,
    val onItemClicked: (Todo) -> Unit
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(R.layout.item_todo, parent, false)
) {
    private val binding = ItemTodoBinding.bind(itemView)

    fun bind(todo: Todo) {
        binding.titleTextView.text = todo.title

        if (todo.isDone) {
            binding.root.setBackgroundColor(Color.RED)
        } else {
            binding.root.setBackgroundColor(Color.TRANSPARENT)
        }

        binding.root.setOnClickListener {
            onItemClicked(todo)
        }
    }

}