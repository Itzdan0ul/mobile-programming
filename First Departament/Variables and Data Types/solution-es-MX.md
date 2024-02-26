# Solución

### Por Urtiz López Dan Jair

1. Para un número decimal, ¿qué tipo de dato se asigna por defecto? Imprimirlo.
```kotlin
fun main() {
    val number = 1.14
    
    println(number::class)
}

/* This code example produces the following output:
    double (Kotlin reflection is not available)
*/
```
2. Volver flotante a la variable decimal.
```kotlin
fun main() {
    val number = 1.14f
    
    println(number::class)
}

/* This code example produces the following output:
    float (Kotlin reflection is not available)
*/
```
3. Declarar una variable `const val` con el valor de `PI` y multiplicarla por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
4. Para el ejemplo anterior, utilizar un **String Template** para imprimir el texto: `"El perímetro del círculo es: $resultado"`, siendo resultado nuestra variable perímetro.
```kotlin
const val PI: Float = 3.1416f

fun main() {
    val number = 1.14f

    val diameter: Float = (number * 2)
    val perimeter: Float = (PI * diameter)

    println("El perímetro del círculo es: $perimeter")
}

/* This code example produces the following output:
    El perímetro del círculo es: 7.1628475
*
```
### La ecuación de la pendiente se obtiene por la siguiente expresión:
$$m = \frac{{y2 - y1}}{{x2 - x1}}$$

5. Expresarla ahora con operadores.
6. Resolver el valor de la pendiente, tomando en cuenta que `P1(4,3), P2(-3,-2)`.
```kotlin
fun main() {
    val m = (-2 - 3) / (-3 - 4)

    println("m = $m")
}

/* This code example produces the following output:
    m = 0
*/
```
7. Del ejercicio anterior, responder: ¿Por qué el resultado obtenido difiere del resultado esperado? **R: Porque se espera que el resultado sea un número decimal, es probable que hayamos recibido un cero como respuesta o bien la estructura de nuestra operación no es la adecuada.**
8. Encontrar una solución para que se refleje el resultado.
```kotlin
fun main() {
    val m: Float = (-2.0f - 3.0f) / (-3.0f - 4.0f)

    println("m = $m")
}

/* This code example produces the following output:
    m = 0.71428573
*/
```
