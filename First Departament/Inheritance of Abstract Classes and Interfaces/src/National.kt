open class National(override val city: String):Travel() {
    override val country = "Mexico"

    protected val fees: Map<String, Float> = mapOf(
        "Monterrey" to 400.0f,
        "Guadalajara" to 350.0f,
        "CDMX" to 360.0f,
        "San Cristóbal de las casas" to 240.0f,
        "San Miguel de Allende" to 320.0f
    )

    override fun getPrice(numDays: Int): Float {
        val fee = fees[city]
        return if (fee == null) 0f else fee * numDays
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
