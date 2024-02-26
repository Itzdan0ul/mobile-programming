/**
 * @school UPIICSA
 * @author Urtiz Lopez Dan Jair
 * @subject Programación Móvil
 * @group 6NM60
 * @date 25 - 02 - 2024
 * */

fun main() {
    val area: Float = calculateAreaOfRectangle(12.0f, 20.0f)
    val volume: Float = calculateVolumeOfPrism(area)
    val average: Float = obtainGradePointAverage(thirdQua = 10.0f)
    val dataType: String = identifyDataType(190)
    val triangle: String = obtainTriangleType(6, 8, 11)
    val repeatedNameCount: Int = countNameOccurrences()

    println("El area del rectángulo es: $area")
    println("El volumen del prisma rectangular es: $volume")
    println("El promedio es: $average")
    println("Es un tipo de dato $dataType")
    println("El triángulo es: $triangle")
    println("Hay $repeatedNameCount que se repiten.")
}

fun calculateAreaOfRectangle(base: Float, height: Float): Float {
    return base * height
}

fun calculateVolumeOfPrism(baseArea: Float, height: Float = 20.0f): Float {
    return baseArea * height
}

fun obtainGradePointAverage(firstQua: Float = 8.0f, secondQua: Float = 8.0f, thirdQua: Float): Float {
    return (firstQua + secondQua * thirdQua) / 3
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

fun identifyDataType(data: Any): String {
    return when (data) {
        is Int -> "Int"
        is String -> "String"
        is Double -> "Double"
        else -> "Otro"
    }
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
