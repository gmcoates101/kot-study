package tictactoe

var board = arrayListOf<ArrayList<String>>()

fun main(args: Array<String>) {
    boardSetup()
    printBoard()

    var continueGame = true

    do {
        println("Please enter your position (e.g. 1, 1) or Q to quit")
        var input = readln()

        try {
            val positions = input.split(",")
            var x = positions[0].trim().toInt()
            var y = positions[1].trim().toInt()

            if (board[x-1][y-1] == "") {
                board[x-1][y-1] = "X"
                printBoard()
                if (checkWinner(true)) {
                    println("Win")
                    continueGame = false
                }
            } else {
                println("The position has already been taken, try again.")
            }

        } catch (e: Exception) {
            if (input.uppercase() != "Q") {
                println("Something was wrong with your entry, try again.")
            }
        } finally {
            if (input.uppercase() == "Q") {
                println("Goodbye")
                break
            }
        }

    } while (continueGame)
}

fun checkWinner(player: Boolean): Boolean {

    var won = false
    val check = if (player) "X" else "O"

    for (i in 0..2) {
        if (board[i][0] == check && board[i][1] == check && board[i][2] == check) {
            won = true
            break
        }
        if (board[0][i] == check && board[1][i] == check && board[2][i] == check) {
            won = true
            break
        }
    }
    if (board[0][0] == check && board[1][1] == check && board[2][2] == check) {
        won = true
    }
    if (board[2][0] == check && board[1][1] == check && board[0][2] == check) {
        won = true
    }

    return won
}

fun printBoard() {
    println("-------------")
    for (i in 0..2) {
        for (j in 0..2) {
            when(board[i][j]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}

fun boardSetup() {
    for (i in 0..2) {
        val row = arrayListOf<String>()
        for (j in 0..2) {
            row.add("")
        }
        board.add(row)
    }
}