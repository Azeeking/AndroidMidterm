package com.example.midterm
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoListAdapter(val todotasks: ArrayList<Todo>, val context: Context): RecyclerView.Adapter<TodoListAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.fragment_todo_list,parent,false)

        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todotasks.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val todotasks = todotasks.get(position)
        holder.titleText.text = todotasks.title
        holder.statusText.text = todotasks.status
        holder.category.text = todotasks.category
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view){
        var titleText: TextView = view.findViewById(R.id.title)
        var statusText: TextView = view.findViewById(R.id.status)
        var category: TextView = view.findViewById(R.id.category)

    }

}