import models.*
import java.util.*

class Challenge {

    companion object {

        @JvmStatic
        fun one() {
            val random = Random().nextInt(50) + 1
            val range = when (random) {
                in 1..10 -> "1 to 10"
                in 11..20 -> "11 to 20"
                in 21..30 -> "21 to 30"
                in 31..40 -> "31 to 40"
                else -> "above 40"
            }

            println("$random is in the range $range")
        }

        @JvmStatic
        fun two() {
            var sum: Long = 0
            for (i in 100..100_000L) {
                sum += i
            }
            println(sum)
        }

        @JvmStatic
        fun three() {
            val bookTitles = arrayListOf<String>("Do Androids Dream of Electric Sheep",
                "LOTR", "We Can Remember It for You Wholesale")

            for (book in bookTitles) {
                if (book.contains('e')) {
                    for (character in book) {
                        println(character)
                    }
                    println()
                }
            }
        }

        @JvmStatic
        fun four() {
            val book = Book("Do Androids Dream of Electric Sheep", "Sci-Fi", 1968, "Philip K. Dick")
            println(book)

            println("${book.title} is borrowed ${book.borrowed}")
            book.borrow()
            book.borrow()
            println("${book.title} is borrowed ${book.borrowed}")
            book.returnItem()
            book.returnItem()
            println("${book.title} is borrowed ${book.borrowed}")
        }

        @JvmStatic
        fun five() {
            val book = Book("Do Androids Dream of Electric Sheep", "Sci-Fi", 1968, "Philip K. Dick")
            println(book)

            val dvd = Dvd("Blade Runner", "Sci-Fi", 1982, (117 * 60))
            println(dvd)
        }
    }
}