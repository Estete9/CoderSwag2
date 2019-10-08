package com.example.coderswag2.services

import com.example.coderswag2.model.Category
import com.example.coderswag2.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes graphic beanie", "$10", "hat1"),
        Product("Devslopes black hat", "$15", "hat2"),
        Product("Devslopes green hat", "$10", "hat3"),
        Product("Devslopes graphic beanie black", "$18", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes gray hoodie", "$25", "hoodie1"),
        Product("Devslopes cammo hoodie", "$28", "hoodie2"),
        Product("Devslopes purple hoodie", "$28", "hoodie3"),
        Product("Devslopes white hoodie", "$20", "hoodie4")
    )
    val shirts = listOf(
        Product("Devslopes gray shirt", "$18", "shirt1"),
        Product("Devslopes cammo shirt", "$20", "shirt2"),
        Product("Devslopes purple shirt", "$20", "shirt3"),
        Product("Devslopes white shirt", "$15", "shirt4"),
        Product("KickFlip Studios","$22","shirt5")

    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        return when (category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }

}