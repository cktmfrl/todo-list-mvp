package com.example.todo_list_mvp.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.todo_list_mvp.databinding.ActivityMainBinding
import com.example.todo_list_mvp.main.MainViewModel
import com.example.todo_list_mvp.main.adapter.TodoListAdapter

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        val adapter = TodoListAdapter { todo ->
            viewModel.toggleTodo(todo)
        }
        adapter.apply {
            binding.todoRecyclerView.adapter = this
        }

        viewModel.todos.observe(this) { todos ->
            adapter.submitList(todos)
        }
    }

}