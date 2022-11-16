package worksheets

val animal = "cat"
var action: String = ""
when (animal) {
    "cat" -> {
        action = "cuddle it"
    }
    "dog" -> {
        action = "throw a ball for it"
    }
    else -> {
        action = "figure it out for yourself"
    }
}
println("When you meet a $animal you should $action.")

var result = ""
val number = 2346
when (number % 2) {
    0 -> result = "even"
    1 -> result = "odd"
}
println("the number is $result")

var mul = 5
var res = when (number % mul) {
    0 -> "multiple of $mul"
    else -> "not multiple of $mul"
}
println(res)

var name = "Eary"
var message = when (name[0].lowercase()) {
    in "a".."c" -> "first 3"
    in "d".."f" -> "second 3"
    else -> "last 20"
}
println("Your initial is in the $message letters of the alphabet.")