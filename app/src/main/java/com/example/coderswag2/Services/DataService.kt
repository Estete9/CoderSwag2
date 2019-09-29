package com.example.coderswag2.Services

import com.example.coderswag2.Model.Category
import com.example.coderswag2.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes graphic beanie", "$10", "hat01"),
        Product("Devslopes black hat", "$15", "hat02"),
        Product("Devslopes green hat", "$10", "hat03"),
        Product("Devslopes graphic beanie black", "$18", "hat04")
    )

    val hoodies = listOf(
        Product("Devslopes gray hoodie", "$25", "hoodie01"),
        Product("Devslopes cammo hoodie", "$28", "hoodie02"),
        Product("Devslopes purple hoodie", "$28", "hoodie03"),
        Product("Devslopes white hoodie", "$20", "hoodie04")
    )
    val shirts = listOf(
        Product("Devslopes gray shirt", "$18", "shirt01"),
        Product("Devslopes cammo shirt", "$20", "shirt02"),
        Product("Devslopes purple shirt", "$20", "shirt03"),
        Product("Devslopes white shirt", "$15", "shirt04"),
        Product("KickFlip Studios","$22","shirt05")

    )
}