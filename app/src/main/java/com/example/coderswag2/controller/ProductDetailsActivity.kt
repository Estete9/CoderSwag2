package com.example.coderswag2.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag2.R
import com.example.coderswag2.utilities.EXTRA_CATEGORY
import com.example.coderswag2.utilities.EXTRA_PRODUCT

class ProductDetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)
        val categoryType = intent.getStringExtra(EXTRA_PRODUCT)
        println(categoryType)
    }
}
