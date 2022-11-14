package worksheets

fun main(args: Array<String>) {

    print("Enter your age: ")

    var age = readLine()
    age.isNullOrEmpty() ?: "0"
    println("Age ${age?.toInt()}")
}
