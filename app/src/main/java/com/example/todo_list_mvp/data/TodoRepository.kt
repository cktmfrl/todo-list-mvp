package com.example.todo_list_mvp.data

import com.example.todo_list_mvp.model.Todo

class TodoRepository {
    private var todos = (0..30).map { num ->
        Todo(
            id = num.toLong(),
            title = "청소 $num"
        )
    }.toMutableList()

    fun getTodos(): List<Todo> {
        return todos
    }

    fun insert(todo: Todo) {
        todos.add(todo)
    }

    fun update(todo: Todo) {
        todos = todos.map { if (it.id == todo.id) todo else it }.toMutableList()
    }

    fun delete(todo: Todo) {
        todos.remove(todo)
    }
}