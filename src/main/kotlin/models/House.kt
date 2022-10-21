package models

class House(val height: Double, val colour: String, val price: Int = 50_000) {

    fun print() {
        println("House [height = $height, colour = $colour, price = $price")
    }
}