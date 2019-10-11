package com.example.coderswag2.controller

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.coderswag2.R
import com.example.coderswag2.utilities.EXTRA_IMAGE
import com.example.coderswag2.utilities.EXTRA_PRICE
import com.example.coderswag2.utilities.EXTRA_PRODUCT

class ProductDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_details)

        val productImage = intent.getStringExtra(EXTRA_IMAGE)
        val productName = intent.getStringExtra(EXTRA_PRODUCT)
        val productPrice = intent.getStringExtra(EXTRA_PRICE)

        val productDetailName = findViewById<TextView>(R.id.productDetailName)
        val productDetailPrice = findViewById<TextView>(R.id.productDetailPrice)
        val productDetailImage = findViewById<ImageView>(R.id.productDetailImage)


        productDetailName?.text = productName
        productDetailPrice?.text = productPrice
        val resourceId = resources.getIdentifier(productImage, "drawable", packageName)
        productDetailImage?.setImageResource(resourceId)


    }
}
