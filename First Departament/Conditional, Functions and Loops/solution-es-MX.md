# Solución

### Por Urtiz López Dan Jair

1. Crear una función que calcule el área de un rectángulo por medio de su base y altura, implementarla en main.
```kotlin
fun main() {
    val area: Float = calculateAreaOfRectangle(12.0f, 20.0f)

    println("El area del rectángulo es: $area")
}

fun calculateAreaOfRectangle(base: Float, height: Float): Float {
    return base * height
}

/* Este código de ejemplo produce la siguiente salida:
    El area del rectángulo es: 240.0
*/
```
2. Crear otra función para calcular el volumen de un prisma rectangular (utilizar la función de área).
```kotlin
fun main() {
    val area: Float = calculateAreaOfRectangle(12.0f, 20.0f)
    val volume: Float = calculateVolumeOfPrism(area)

    println("El volumen del prisma rectangular es: $volume")
}

fun calculateAreaOfRectangle(base: Float, height: Float): Float {
    return base * height
}

fun calculateVolumeOfPrism(baseArea: Float, height: Float = 20.0f): Float {
    return baseArea * height
}

/* Este código de ejemplo produce la siguiente salida:
    El volumen del prisma rectangular es: 4800.0
*/
```
3. Crear una función que entregue el promedio de tres calificaciones. Esta debe recibir dos parámetros con calificaciones por defecto 8, y el tercer parámetro no debe venir predefinido.
4. Utilizar la función promedio y comentar qué pasa si se ingresa sólo una calificación en la función y después con dos. Finalmente, buscar que la función corra enviando únicamente la tercera calificación con `10f`. **R: Si se ingresa solo una calificación obtenemos un errorm, al igual que si solo envíamos dos; ya que aunque sean opcionales la última es necesaria enviarla. Finalmente, para enviar la última calificaciones es necesario darle el valor al parámetro por defecto.**
```kotlin
fun main() {
    val average: Float = obtainGradePointAverage(thirdQua = 10.0f)

    println("El promedio es: $average")
}

fun obtainGradePointAverage(firstQua: Float = 8.0f, secondQua: Float = 8.0f, thirdQua: Float): Float {
    return (firstQua + secondQua * thirdQua) / 3
}

/* Este código de ejemplo produce la siguiente salida:
    El volumen del prisma rectangular es: 29.333334
*/
```
5. Crear una función que pida como parámetros las medidas de los lados de un triángulo. Debe imprimirnos el tipo de tríangulo:

    - Equilatero: los tres lados tienen el mismo valor
    - Isóceles: Tiene dos lados iguales
    - Escaleno: Los tres lados son diferentes
```kotlin
fun main() {
   val triangle: String = obtainTriangleType(6, 8, 11)
   
   println("El triángulo es: $triangle")
}

fun obtainTriangleType(adjacent: Int, opposite: Int, hypotenuse: Int): String {
   return if (adjacent == opposite && opposite == hypotenuse) {
      "Equilátero"
   } else if (adjacent == opposite || opposite == hypotenuse || hypotenuse == adjacent) {
      "Isósceles"
   } else {
      "Escaleno"
   }
}

/* Este código de ejemplo produce la siguiente salida:
    El triángulo es: Escaleno
*/
```
6. Con When identificar si el tipo de dato es:
   - `String`
   - `Int`
   - `Double`
   - `Otro`
```kotlin
fun main() {
   val dataType: String = identifyDataType(190)
   
   println("Es un tipo de dato $dataType")
}

fun identifyDataType(data: Any): String {
   return when (data) {
      is Int -> "Int"
      is String -> "String"
      is Double -> "Double"
      else -> "Otro"
   }
}

/* Este código de ejemplo produce la siguiente salida:
    Es un tipo de dato Int
*/
```
7. Crear y utilizar una función que regrese el número de veces que se repite un nombre en la siguiente lista de nombres:
- Pedro Luis
- Juan Manuel
- Juan Luis
- María Inés
- Romeo
- Ernesto
- Juan Pedro
- Ariadna
- Mireya María
- Ana Sofía
- José Juan
```kotlin
fun main() {
   val repeatedNameCount: Int = countNameOccurrences()

   println("Hay $repeatedNameCount que se repiten.")
}

fun countNameOccurrences(): Int {
   val names: List<String> = listOf(
      "Pedro Luis",
      "Juan Manuel",
      "Juan Luis",
      "María Inés",
      "Romeo",
      "Ernesto",
      "Juan Pedro",
      "Ariadna",
      "Mireya María",
      "Ana Sofía",
      "José Juan")

   val namesToCount: List<String> = listOf("Pedro", "Luis", "Juan", "María", "Inés", "Romeo", "Ernesto", "Ariadna", "José", "Mireya", "Manuel", "Ana", "Sofía")

   var counter = 0

   for (nameList: String in names) {
      for (name: String in nameList.split(" ")) {
         if (namesToCount.contains(name)) {
            counter++
            break
         }
      }
   }

   return counter
}

/* Este código de ejemplo produce la siguiente salida:
    Hay 10 que se repiten.
*/
```
