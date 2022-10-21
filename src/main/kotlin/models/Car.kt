package models

class Car : Driveable, Buildable {

    override var buildTimeDays: Int = 100

    override fun drive() {
        println("Driving")
    }

    override fun build() {
        println("Car built")
    }
}