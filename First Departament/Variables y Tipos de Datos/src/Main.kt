/**
 * @school UPIICSA
 * @author Urtiz Lopez Dan Jair
 * @subject Programación Móvil
 * @group 6NM60
 * @date 18 - 02 - 2024
 * */

const val PI: Float = 3.1416f

fun main() {
    val number = 1.14f

    println(number)
    println(number::class)

    val diameter: Float = (number * 2)
    val perimeter: Float = (PI * diameter)

    println("El perímetro del círculo es: $perimeter")

    val m: Float = (-2.0f - 3.0f) / (-3.0f - 4.0f)

    println("m = $m")
}
