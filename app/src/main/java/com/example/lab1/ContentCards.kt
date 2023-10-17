package com.example.lab1

sealed class ContentCards

data class BigContentCard(
    val id: String,
    val header: String,
    val subheader: String,
    val description: String,
) : ContentCards()

data class LittleContentCard(
    val id: String,
    val header: String,
    val subheader: String,
) : ContentCards()