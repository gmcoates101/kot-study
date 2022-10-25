package models

import java.util.*

class Car(private val colour: Colour) : Driveable, Buildable {

    override var buildTimeDays: Int = 100

    override fun drive() {
        println("Driving")
    }

    override fun build() {
        println("Car built")
    }

    override fun toString(): String {
        var name = capFirst(colour.name)
        return "Car [colour=$name}]"
    }

    private fun capFirst(value: String): String {
        return value.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }
}