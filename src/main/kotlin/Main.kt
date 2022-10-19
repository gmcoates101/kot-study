import models.Person

fun main(args: Array<String>) {

    listThings()
    println()
    println()
    persons()
    println()

//    Challenge.one()
//    println()
//    Challenge.two()
//    println()
//    Challenge.three()
//    println()
}

fun persons() {
    var gary = Person("Gary", 51)
    personStuff(gary, "Satya")
    //gary.age = 21
    var mary = Person("Mary", 52)
    personStuff(mary, "Stephen")
}

fun personStuff(p: Person, friend: String) {
    println(p)
    p.speak()
    p.greet(friend)
    println("${p.name} was born in ${p.yearOfBirth}")
    println()
}

fun listThings() {

    var arr = arrayOf(1, 2, 3, 4, 5)
    println(arr.contentToString())

    val arrLis = arrayListOf<String>("One", "Two", "Three", "Four", "Five")
    val arrLis2 = arrayListOf<String>("Six", "Seven", "Eight", "Nine", "Ten")
    var arrLis3 = arrLis + arrLis2
    println(arrLis3)

    var ran = 1..10
    for (i in ran) print("$i ")
}

