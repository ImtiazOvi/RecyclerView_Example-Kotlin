package com.imtiaz.recyclerview_kotlin.example1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imtiaz.recyclerview_kotlin.R

class UserAdapter(val userList: ArrayList<ModelUser>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
 
    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_items_user, parent, false)
        return ViewHolder(v)
    }
 
    //this method is binding the data on the list
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(userList[position])
    }
 
    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return userList.size
    }
 
    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
 
        fun bindItems(user: ModelUser) {
            val textViewName = itemView.findViewById(R.id.txt_name) as TextView
            val textViewAddress  = itemView.findViewById(R.id.txt_address) as TextView
            textViewName.text = user.name
            textViewAddress.text = user.address
        }
    }
}