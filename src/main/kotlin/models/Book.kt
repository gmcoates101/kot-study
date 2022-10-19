package models

class Book(val title: String, val author: String, val yearOfPublication: Int, var borrowed: Boolean = false) {

    override fun toString(): String {
        return "$title written by $author published in $yearOfPublication"
    }

    fun borrowBook() {
        if (!borrowed) {
            borrowed = true
        } else {
            println("Unable to borrow book not available.")
        }
    }

    fun returnBook() {
        if (borrowed) {
            borrowed = false
        } else {
            println("Unable to return, still available.")
        }
    }
}