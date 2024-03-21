# Solución

### Por Urtiz López Dan Jair

A partir del proyecto del sistema de reserva de Viajes (`class Travel`) realiza los siguientes puntos:

1. Crear la clase International para viajes internacionales, contemplar que ahora el usuario proporciona el nombre del Pais y la Cuidad.
```kotlin
open class International(override val country: String, override val city: String): Travel() {
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

    override fun getPrice(numDays: Int): Int {
        val fee = fees[city]
        return if (fee == null) 0 else fee * numDays
    }

    override fun quotePrice(numDays: Int) {
        val price = getPrice(numDays)

        if(price == 0){
            println("Lo sentimos, no hacemos viajes a esta ciudad")
        } else{
            println("Tu viaje a $city cuesta \$$price")
        }
    }
}
```
2. Existe un miembro en la Clase Travel que a pesar de ser abstracta, podría ser idéntico tanto en National como en International. En caso de afirmación, agrega el cuerpo en la clase abstracta y elimínala de sus hijos. **R: No, explícitamente no hay ningún miembro.**
3. Debemos establecer los impuestos por país, y las ciudades a donde viajar:

    - Alemania tiene el 16% del precio total como impuesto y las ciudades disponibles son:
        - Munich, $980 por día
        - Berlín, $820 por día
        - Francfort, $850 por día

    - Chile cobra únicamente el 5% como impuesto y sus ciudades son:
        - Santiago, $643 por día
        - Valparaíso, $721 por día

    - Canadá cobra el 10% de impuesto y las ciudades a visitar son:
        - Vancouver, $620 por día
        - Ottawa, $680 por día
        - Montreal, $600 por día
```kotlin
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
```

4. Redefinir la función `getPrice()` para que se obtenga el precio de un viaje con impuesto incluido.
````kotlin
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
````
5. Crear una interfaz que permita cancelar viajes. Implementarlo en la clase `NationalLowSeason`.
```kotlin
// ICancel.kt
interface ICancel {
    fun cancelTravel() {
        println("El viaje se ha cancelado.")
    }
}

// NationalLowSeason.kt
class NationalLowSeason(city: String) : National(city), IPromotion, ICancel {
   override  val discount: Int = 10
   override val typeDiscount: Int = 0

   override fun getPrice(numDays: Int): Float {
      val amount = super.getPrice(numDays)
      return if (amount == 0f) 0f else getDiscountPrice(amount)
   }
}
```

Ejecución de la actividad:
```kotlin
fun main() {
    val germany = International("Alemania", "Munich")
    val chile = International("Chile", "Santiago")
    val canada = International("Canada", "Vancouver")

    germany.reserve(3)
    chile.reserve(7)
    canada.reserve(5)

    val mexicoPoorTravel = NationalLowSeason("Guadalajara")

    mexicoPoorTravel.reserve(4)
    mexicoPoorTravel.cancelTravel()
}

/* Este código de ejemplo produce la siguiente salida:
    ¡Viaje reservado exitosamente! 
                       País: Alemania
                       Ciudad: Munich
                       Precio: 470.4
¡Viaje reservado exitosamente! 
                       País: Chile
                       Ciudad: Santiago
                       Precio: 180.04
¡Viaje reservado exitosamente! 
                       País: Canada
                       Ciudad: Vancouver
                       Precio: 310.0
¡Viaje reservado exitosamente! 
                       País: Mexico
                       Ciudad: Guadalajara
                       Precio: 1260.0
El viaje a se ha cancelado
*/
```