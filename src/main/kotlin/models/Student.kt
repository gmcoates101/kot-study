package models

class Student(override val name: String, override var age: Int, private val studentId: String) : Person(name, age) {

    fun print() {
        println("Student [name=$name, id=$studentId]")
    }
}