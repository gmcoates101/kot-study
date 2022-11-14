package worksheets

var cost = 29.99F
var numOfItems: String? = null
println(cost * (numOfItems?.toInt() ?: 1))

var catName: String? = null
println(catName ?: "Give the cat a name")

var nameOne: String = "One"
var nameTwo: String? = null

println(nameOne)
println(nameTwo)

nameTwo = "duke"
println(nameTwo!!::class.java)

println(nameTwo?.length)
nameTwo = null
println(nameTwo?.length)

var numOne: Int? = 19
var numTwo: Int? = 4

println(numOne?.plus(numTwo!!))
println(numOne?.minus(numTwo!!))
println(numOne?.times(numTwo!!))
println(numOne?.div(numTwo!!))
println(numOne?.rem(numTwo!!))

var str: String? = "Cats are cool"
println(str?.substring(3, 6))

var dbl: Double? = 13.94
dbl = dbl?.times(6)
println(dbl?.toFloat())

var userName: String? = "Gary"
println(userName?.length)

var conNum: Float? = 99.7F
var conDbl = conNum?.toDouble()
println(conDbl?.times(7)?.toString()?.length)