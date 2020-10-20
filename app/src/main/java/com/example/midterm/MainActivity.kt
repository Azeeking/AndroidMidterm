package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val todotasks = ArrayList<Todo>()
        for(i in 1..10){
            todotasks.add(Todo("18BD","title","asdad","online","sdasd",20+i))
        }

        val todoListAdapter = TodoListAdapter(todotasks,this)
        val layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager = layoutManager
        recyclerview.adapter = todoListAdapter

    }
}