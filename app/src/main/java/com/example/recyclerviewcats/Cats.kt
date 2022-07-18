package com.example.recyclerviewcats

data class Cats (
    val name:String,
    val raza:String,
    val edad:Int,
    var sexo:Boolean,
    val chip:Boolean,
    val esterilizado:Boolean,
    val photo:String)