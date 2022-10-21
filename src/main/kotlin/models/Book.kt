package models

class Book(override val title: String, override val genre: String, override val yearOfPublication: Int, val author: String) : InventoryItem(title, genre, yearOfPublication) {

    override fun toString(): String {
        var superToString = super.toString()
        return "$superToString Book [author=$author]"
    }
}