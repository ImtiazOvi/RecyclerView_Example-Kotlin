package com.imtiaz.recyclerview_kotlin.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.imtiaz.recyclerview_kotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity2 : AppCompatActivity() {
    // properties start ****************************************************************************

    // initializing an empty ArrayList to be filled with animals
    private val animals: ArrayList<String> = ArrayList()
    // properties end ******************************************************************************

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // loads animals into the ArrayList
        addAnimals()

        // creates a vertical Layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // you can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        // recyclerview.layoutManager = GridLayoutManager(this, 2)

        // access the RecyclerView Adapter and load the data into it
        recyclerview.adapter = AnimalAdapter(animals, this)

    }

    // adds animals to the empty animals ArrayList
    fun addAnimals() {
        animals.add("dog")
        animals.add("cat")
        animals.add("owl")
        animals.add("cheetah")
        animals.add("raccoon")
        animals.add("bird")
        animals.add("snake")
        animals.add("lizard")
        animals.add("hamster")
        animals.add("bear")
        animals.add("lion")
        animals.add("tiger")
        animals.add("horse")
        animals.add("frog")
        animals.add("fish")
        animals.add("shark")
        animals.add("turtle")
        animals.add("elephant")
        animals.add("cow")
        animals.add("beaver")
        animals.add("bison")
        animals.add("porcupine")
        animals.add("rat")
        animals.add("mouse")
        animals.add("goose")
        animals.add("deer")
        animals.add("fox")
        animals.add("moose")
        animals.add("buffalo")
        animals.add("monkey")
        animals.add("penguin")
        animals.add("parrot")
    }
}
