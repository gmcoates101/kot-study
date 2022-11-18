package worksheets

import java.text.DateFormat
import java.text.NumberFormat
import java.util.*

val tax = 1.2
val products = mapOf(Pair("OJ", 7.89), Pair("Beer", 10.20), Pair("Whisky", 50.10), Pair("Wine", 35.12))
val locale: Locale? = Locale.Builder().setLanguage("en").setRegion("GB").build()
val currencyFormat: NumberFormat = NumberFormat.getCurrencyInstance(locale!!)
val dateFormat: DateFormat = DateFormat.getDateInstance()

fun productPriceIncTax(name: String, price: Double) {
    val withTax = currencyFormat.format(price * tax)
    println("$name costs $withTax with tax at ${dateFormat.format(Date())}.")
}

fun productPriceIncTax(products: Map<String, Double>) {
    products.forEach { productPriceIncTax(it.key, it.value) }
}

productPriceIncTax("Water", 3.0)
productPriceIncTax(products)