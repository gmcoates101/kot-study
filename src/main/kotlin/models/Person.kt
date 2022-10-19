package models

import java.util.Calendar

class Person(val name: String, var age: Int) {

    val yearOfBirth: Int = Calendar.getInstance().weekYear - age

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name I'm ${this.name}, pleased to meet you.")
    }

   // fun getYearOfBirth() = yearOfBirth

    override fun toString(): String {
        return "$name is $age years old."
    }
}