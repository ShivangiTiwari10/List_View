package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayAdapter: ArrayAdapter<*>

        val toDo = arrayOf(
            "Add ListView in Xml", "load XML resource from our activity onCreate()", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        )

        // access the listView from xml file
        arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, toDo
        )
        binding.userlist.adapter = arrayAdapter

    }
}