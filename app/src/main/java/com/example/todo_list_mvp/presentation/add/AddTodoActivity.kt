package com.example.todo_list_mvp.presentation.add

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.todo_list_mvp.R

class AddTodoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_todo)

        val intent = Intent()
        intent.putExtra("result", "완료")
        setResult(Activity.RESULT_OK, intent)
    }
}