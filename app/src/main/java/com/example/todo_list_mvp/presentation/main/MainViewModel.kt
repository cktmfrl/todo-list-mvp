package com.example.todo_list_mvp.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.todo_list_mvp.data.TodoRepository
import com.example.todo_list_mvp.model.Todo

class MainViewModel : ViewModel() {
    private val todoRepository = TodoRepository()

    private val _todos = MutableLiveData<List<Todo>>(listOf())
    val todos: LiveData<List<Todo>> = _todos

    init {
        _todos.value = todoRepository.getTodos()
    }

    fun toggleTodo(todo: Todo) {
        todoRepository.update(todo.copy(isDone = !todo.isDone))
        _todos.value = todoRepository.getTodos()
    }
}