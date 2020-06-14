package com.imtiaz.recyclerview_kotlin.example1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaz.recyclerview_kotlin.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //getting recyclerview from xml
        val recyclerView = findViewById(R.id.recyclerview) as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //crating an arraylist to store users using the data class user
        val users = ArrayList<ModelUser>()

        //adding some dummy data to the list
        users.add(
            ModelUser(
                "Md Imtiaz Uddin",
                "Feni sadar, Feni"
            )
        )
        users.add(
            ModelUser(
                "Jamilur Reza",
                "Adabor, Dhaka"
            )
        )
        users.add(
            ModelUser(
                "Akash Khan",
                "Dhanmondi, Dhaka"
            )
        )
        users.add(
            ModelUser(
                "Atikul Islam",
                "Arambag, Dhaka"
            )
        )
        //creating adapter
        val adapter = UserAdapter(users)

        //now adding the adapter to recyclerview
        recyclerView.adapter = adapter
    }
}
