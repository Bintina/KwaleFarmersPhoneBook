package com.bintina.kwalefarmersphonebook.model

data class Farmer(
    val farmName: String,
    val phoneContact: String,
    val produceList: List<Produce>
)
