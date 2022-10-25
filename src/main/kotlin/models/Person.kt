package models

import java.util.Calendar

open class Person(open val name: String, private var age: Int) {

    val yearOfBirth: Int

    private val currentYear: Int = Calendar.getInstance().get(Calendar.YEAR)

    fun speak() {
        println("Hello")
    }

    fun greet(name: String) {
        println("Hello $name I'm ${this.name}, pleased to meet you.")
    }

    override fun toString(): String {
        return "$name is $age years old."
    }

    init {
        yearOfBirth = currentYear - age
    }
}