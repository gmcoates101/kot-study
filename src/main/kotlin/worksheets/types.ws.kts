val cats = 2
println(cats::class.java)
val longCats = cats.toLong()
println(longCats::class.java)

val people = 75_000_000_000
val fewPeople = people.toInt()
valueType(fewPeople)

valueType("7".toBigDecimal())

fun valueType(x: Any) {
    println("$x : ${x::class.java}")
}