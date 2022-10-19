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
            var sum: Long = 0;
            for (i in 100..100_000L) {
                sum += i
            }
            println(sum)
        }

        @JvmStatic
        fun three() {
            var books = arrayListOf<String>("Do Androids Dream of Electric Sheep",
                "LOTR", "We Can Remember It for You Wholesale")

            for (book in books) {
                if (book.contains('e')) {
                    for (character in book) {
                        println(character)
                    }
                    println()
                }
            }
        }
    }
}