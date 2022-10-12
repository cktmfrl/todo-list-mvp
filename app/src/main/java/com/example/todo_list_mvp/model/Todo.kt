package com.example.todo_list_mvp.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Todo(
    val id: Long,
    val title: String,
    val timestamp: Long = Date().time,
    val isDone: Boolean = false
) : Parcelable