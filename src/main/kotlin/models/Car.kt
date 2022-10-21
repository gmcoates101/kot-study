package models

enum class Colour {
    RED,
    GREEN,
    BLUE
}

class Car(val colour: Colour) : Driveable, Buildable {

    override var buildTimeDays: Int = 100

    override fun drive() {
        println("Driving")
    }

    override fun build() {
        println("Car built")
    }

    override fun toString(): String {
        var name = colour.name.capitalize()
        return "Car [colour=$name}]"
    }
}