package hangman

import kotlin.random.Random

val words = listOf("guitar", "bridge", "football", "computer", "steak", "apples", "fridge", "prague", "truck", "orange", "java", "spring", "beer", "airport", "frisbee", "zapper", "zebra")
val guesses = arrayListOf<Char>()
var word = ""
var remainingGuesses = 6
var mistakes = 0

fun main(args: Array<String>) {
    setupGame()
    gameLoop()

    if (mistakes == 6) {
        printGameStatus()
    } else {
        setFree()
    }
    println("The word was $word")
}

fun gameLoop() {
    var gameOver = false

    do {
        printGameStatus()
        println("Please enter your guess?")
        val guess = readLine() ?: ""
        if (guess.isEmpty()) {
            println("That's not a real guess is it? Try again.")
        } else {
            val letter = guess[0].uppercase()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i].toString() == letter) {
                        guesses[i] = letter.toCharArray()[0]
                    }
                }
                if(!guesses.contains('_')) {
                    gameOver = true
                }
            } else {
                println("Sorry that's not found")
                remainingGuesses--
                mistakes++
                gameOver = mistakes == 6
            }
        }
    } while (!gameOver)
}

fun setupGame() {
    word = words[Random.nextInt(words.size)].uppercase()
    for (i in word.indices)
        guesses.add('_')
}

fun printGameStatus() {

    when (mistakes) {
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es)")
}

fun print0Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print1Mistake() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |        ")
    println("  |        ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print2Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |      | ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print3Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|  ")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print4Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |        ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print5Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      O ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     /  ")
    println(" /|\\      ")
    println("/ | \\     ")
}

fun print6Mistakes() {
    println("  |------|-")
    println("  |      | ")
    println("  |      0 ")
    println("  |     /|\\")
    println("  |      | ")
    println("  |     / \\")
    println(" /|\\      ")
    println("/ | \\     ")
    println("You lost")
}

fun setFree() {
    println("  |------|-")
    println("  |      | ")
    println("  |        ")
    println("  |        ")
    println("  |      O ")
    println("  |     /|\\")
    println(" /|\\     |  ")
    println("/ | \\   / \\")
    println("Congratulations")
}