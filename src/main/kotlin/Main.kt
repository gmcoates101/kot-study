import models.*

fun main() {

    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b}
    println(sum(8, 9).toString())

    Masterclass.chap24()
    println()

    println(Masterclass.chap45(33.9, 48.3, 5.6, 6.9, 7.8))
    println()

    Masterclass.chap55()
    println()

    Masterclass.chap61()
    println()

    Masterclass.chap62()
    println()

    listThings()
    println()
    println()

    persons()

    houses()
    println()

    cars()
    println()

    println("CHALLENGES")
    Challenge.one()
    println()
    Challenge.two()
    println()
//    Challenge.three()
//    println()
    Challenge.four()
    println()
    Challenge.five()
    println()
    Challenge.six()
    println()
}

fun cars() {
    val car = Car(Colour.BLUE)
    println(car)
}

fun houses() {
    val house = House(colour = "Green", height = 100.1)
    house.print()
}

fun persons() {
    val gary = Person("Gary", 51)
    personStuff(gary, "Satya")

    val mary = Person("Mary", 52)
    personStuff(mary, "Stephen")

    val ady = Student("Ady", 29, "10193T004")
    personStuff(ady, "Rachael")
    ady.print()
}

fun personStuff(p: Person, friend: String) {
    println(p)
    p.speak()
    p.greet(friend)
    println("${p.name} was born in ${p.yearOfBirth}")
    println()
}

fun listThings() {

    val arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.contentToString())

    val arrLis = arrayListOf("One", "Two", "Three", "Four", "Five")
    val arrLis2 = arrayListOf("Six", "Seven", "Eight", "Nine", "Ten")
    val arrLis3 = arrLis + arrLis2
    println(arrLis3)

    val ran = 1..10
    for (i in ran) print("$i ")
}

