package models

abstract class InventoryItem(open val title: String, open val genre: String, open val yearOfPublication: Int, var borrowed: Boolean = false) : Lendable {

    override fun borrow() {
        if (!borrowed) {
            borrowed = true
        } else {
            println("Unable to borrow this item not available.")
        }
    }

    fun returnItem() {
        if (borrowed) {
            borrowed = false
        } else {
            println("Unable to return, still available.")
        }
    }

    override fun toString(): String {
        return "InventoryItem [title=$title genre=$genre, yearOfPublication=$yearOfPublication, borrowed=$borrowed]"
    }
}