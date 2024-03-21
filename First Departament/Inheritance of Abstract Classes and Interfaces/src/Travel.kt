abstract class Travel {
    abstract val country: String
    abstract val city: String
    protected val serviceType = "Viaje"
    protected var reserved = false
    protected var paidAmount: Float = 0f
    protected var taxes: Float = 0f

    fun reserve(numDays: Int) {

        if(reserved){
            println("""¡Ya reservaste tu viaje! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
            return
        }

        val amount: Float = getPrice(numDays)

        if(amount == 0f) {
            return
        }

        reserved = true
        paidAmount = amount

        println("""¡Viaje reservado exitosamente! 
                       País: $country
                       Ciudad: $city
                       Precio: $paidAmount""".trimMargin())
    }

    protected abstract fun getPrice(numDays: Int): Float
    protected abstract fun quotePrice(numDays: Int): Unit
}
