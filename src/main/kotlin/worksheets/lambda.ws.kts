package worksheets

fun sayHello(names: ArrayList<String>, doFun: (String) -> Unit) {
    names.forEach { doFun(it) }
}

var names = arrayListOf("Gary", "Stephen", "Adrian", "Oskar", "Milan", "Derek", "James", "Matthew")
var hello = {name: String -> println("Hello $name")}
var goodbye = {name: String -> println("Goodbye $name")}

sayHello(names, hello)
sayHello(names, goodbye)

fun greet(names: ArrayList<String>, greetClient: (String) -> String): ArrayList<String> {
    val greetings = ArrayList<String>()
    names.forEach { greetings.add(greetClient(it)) }
    return greetings
}

var greetings = greet(names) {name: String -> "Welcome $name"}
greetings
    .sorted()
    .forEach { println(it) }