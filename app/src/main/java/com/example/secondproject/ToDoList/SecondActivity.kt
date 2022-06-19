package com.example.secondproject.ToDoList

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.secondproject.R
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    private lateinit var todoAdapter : TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Toast.makeText(this, "To Do List Opened!!", Toast.LENGTH_SHORT).show()

        todoAdapter = TodoAdapter(mutableListOf())

        rvToDo.adapter = todoAdapter
        rvToDo.layoutManager = LinearLayoutManager(this)

        btnAdd.setOnClickListener {
            val todoTitle = etTitle.text.toString()
            if (todoTitle.isNotEmpty()) {
                val todo = ToDo(todoTitle)
                todoAdapter.addTodo(todo)
                etTitle.text.clear()
            }
        }

        btnDelete.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}