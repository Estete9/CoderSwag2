package com.example.coderswag2.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.Toast
import com.example.coderswag2.Adapters.CategoryAdapter
import com.example.coderswag2.Model.Category
import com.example.coderswag2.R
import com.example.coderswag2.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
 lateinit var  adapter: CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val Category=DataService.categories[i]
            Toast.makeText(this,"clicked on ${Category.title} cell", Toast.LENGTH_SHORT).show()
        }
    }
}
