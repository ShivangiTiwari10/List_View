package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//       1. using arrayOf
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

//     2. using ArrayListOf

//      step 1- Add listView in xml

//      step 2.make arrayList
        val taskList = arrayListOf<String>()

        taskList.add("Complete the app dev projects")
        taskList.add("Learn list view")
        taskList.add("Work on resume")
        taskList.add("Improve internet presence")

//      step 3. create Adapter
        val adapterMyList = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)

//      step 4. Set Adapter in ListView
        binding.userlist.adapter = adapterMyList


//      step: 5. listener on item clicked
        binding.userlist.setOnItemClickListener { adapterView, view, i, l ->

            val text = "Clicked on Item" + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }

    }
}