package worksheets

println(5 * 5 + 5)
println("Hi" + " " + "John")

val rate = 0.055F
var amountInAccount: Float = 1000F
var year = 0

do {
    amountInAccount += amountInAccount * rate
    println(amountInAccount)
    year++
} while (year < 5)

