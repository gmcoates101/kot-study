package models

class MobilePhone(osName: String, brand: String, model: String, var battery: Int = 25) {

    init {
        println("Mobile Phone [osName=$osName, brand=$brand, model=$model]")
    }

    fun chargeBattery(charged: Int) {
        println("Current Charge: $battery")
        println("Charged: $charged")
        battery += charged
        println("New Current Charge: $battery")
    }
}