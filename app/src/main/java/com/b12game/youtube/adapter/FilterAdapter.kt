package com.b12game.youtube.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.youtube.R
import com.b12game.youtube.model.Filter

class FilterAdapter (var context: Context, var items: ArrayList<Filter>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed_filter,parent,false)
        return FilterViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val filter = items[position]

        if(holder is FilterViewHolder){
            var tv_title = holder.tv_title
            tv_title.text = filter.title
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class FilterViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var tv_title = view.findViewById<TextView>(R.id.tv_title)
    }

}