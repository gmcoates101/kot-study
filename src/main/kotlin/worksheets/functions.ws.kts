package worksheets

import java.text.DateFormat
import java.text.NumberFormat
import java.util.*

val products = mapOf(
        Pair("Water", 1.25),
        Pair("Orange Juice", 3.10),
        Pair("Beer", 3.80),
        Pair("Whisky", 5.10),
        Pair("Wine", 4.12))

fun productPriceIncTax(name: String, price: Double) {
    val tax = 1.2
    val locale: Locale? = Locale.Builder().setLanguage("en").setRegion("GB").build()
    val currencyFormat: NumberFormat = NumberFormat.getCurrencyInstance(locale!!)
    val dateFormat: DateFormat = DateFormat.getDateInstance()
    val withTax = currencyFormat.format(price * tax)

    println("$name costs $withTax with tax at ${dateFormat.format(Date())}.\n")
}

fun productPriceIncTax(products: Map<String, Double>) = products.forEach { productPriceIncTax(it.key, it.value) }

productPriceIncTax(products)