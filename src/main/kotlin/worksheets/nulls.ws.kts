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

var dbl: Double? = 88.9869
val res = dbl?.times(6)
println(res?.toFloat())

