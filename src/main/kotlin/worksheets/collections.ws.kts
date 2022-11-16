package worksheets

val animals = arrayListOf("lion", "zebra", "chimp", "elephant")
animals.add("panda bear cub")
println(animals)
animals.removeAt(animals.indexOf("lion"))
println(animals)
var requested = listOf("elephant", "giraffe")
println("Does the zoo have elephants and giraffes? ${animals.containsAll(requested)}")

var setOfNums = setOf(8, 65, 76, 8, 96, 43)
println(setOfNums)
setOfNums.forEach { println(it) }

var hashSetOfNums = setOf(8, 65, 76, 8, 96, 43)
println(hashSetOfNums)
var hashAdd = hashSetOfNums.plus(19)
var hashMinus = hashSetOfNums.minus(76)
println(hashAdd)
println(hashMinus)

val countOf = mapOf<Int, Int>(Pair(1, 99), Pair(2, 76), Pair(3, 44))
println(countOf)
println(countOf.keys::class.java)
println(countOf.values::class.java)

var attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253), Pair("c", null))
attendance["26 Sept"] = 6354
println("${attendance["25 Sept"]!!.plus(attendance["26 Sept"]!!)} attended on the 25th and 26th Sept")
println("Do we have data for 22 Sept? ${attendance.containsKey("22 Sept")}")