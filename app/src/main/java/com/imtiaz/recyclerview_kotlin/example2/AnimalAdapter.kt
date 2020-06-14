package com.imtiaz.recyclerview_kotlin.example2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.imtiaz.recyclerview_kotlin.R
import kotlinx.android.synthetic.main.row_items_user.view.*

class AnimalAdapter(val items : ArrayList<String>, val context: Context) : RecyclerView.Adapter<AnimalAdapter.ViewHolder>() {

    // inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_items_animals, parent, false)
        return ViewHolder(v);
    }

    // gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    // binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.tvAnimalType?.text = items.get(position)
    }

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // holds the TextView that will add each animal to
        val tvAnimalType = view.txt_name
    }
}