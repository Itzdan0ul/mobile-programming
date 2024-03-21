open class International(override val country: String, override val city: String): Travel() {
    protected val feesByCountry: Map<String, Float> = mapOf(
        "Alemania" to 0.16f,
        "Chile" to 0.04f,
        "Canada" to 0.10f
    )

    protected val fees: Map<String, Int> = mapOf(
        "Munich" to 980,
        "Berlín" to 820,
        "Francfort" to 850,
        "Santiago" to 643,
        "Valparaíso" to 721,
        "Vancouver" to 620,
        "Ottawa" to 680,
        "Montreal" to 600
    )

    override fun getPrice(numDays: Int): Float {
        val countryTaxe: Float? = feesByCountry[country]
        val fee: Int? = fees[city]

        return if (countryTaxe != null) {
            return if (fee == null) {
                0f
            } else {
                (fee * numDays) * countryTaxe
            }
        } else {
            0f
        }
    }

    override fun quotePrice(numDays: Int) {
        val price: Float = getPrice(numDays)

        if(price == 0f){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price")
        }
    }
}
