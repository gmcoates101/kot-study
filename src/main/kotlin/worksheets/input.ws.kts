package worksheets

import java.util.Calendar

// print(message = "Enter your year of birth: ")
val yob = "1971" // readLine() ?: "0"

val currentYear = Calendar.getInstance().weekYear
val age = (currentYear - yob.toInt())
println("You are $age years old")