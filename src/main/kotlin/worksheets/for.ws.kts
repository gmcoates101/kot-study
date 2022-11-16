package worksheets

val customers = hashMapOf(Pair("Alice", 5), Pair("Kelly", 7), Pair("Fred", 3))
for(customerName in customers.keys) {
    println("$customerName you purchased ${customers[customerName]} items.")
}
for((name, purchases) in customers) {
    println("$name you purchased $purchases items.")
}
customers.forEach { (name, purchases) ->
    println("$name you purchased $purchases items.")
}
for(x in 1..10) {
    println(x)
}
(1..10).forEach { println(it) }
(5 downTo 1).forEach { println(it) }
(1 .. 10 step 2).forEach { println(it) }