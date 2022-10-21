package models

class Dvd(override val title: String, override val genre: String, override val yearOfPublication: Int, val lengthInSeconds: Int) : InventoryItem(title, genre, yearOfPublication) {

    override fun toString(): String {
        var superToString = super.toString()
        return "$superToString Dvd [lengthInSeconds=$lengthInSeconds]"
    }
}