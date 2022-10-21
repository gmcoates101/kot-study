package models

import java.util.Calendar

open class Person {

    open val name: String
    open var age: Int
    val yearOfBirth: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        this.currentYear = Calendar.getInstance().get(Calendar.YEAR)
        yearOfBirth = currentYear - age
    }

    private val currentYear: Int

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name I'm ${this.name}, pleased to meet you.")
    }

    override fun toString(): String {
        return "$name is $age years old."
    }
}