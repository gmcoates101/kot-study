package com.org.main

import models.Book

fun main(args: Array<String>) {
    val book = Book(
        title = "Silence of the Lambs",
        genre = "Horror",
        yearOfPublication = 1988,
        author = "Thomas Harris"
    )

    println(book)
}