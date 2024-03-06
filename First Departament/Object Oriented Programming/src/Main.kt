fun main() {
    val vehicle = Vehicle()

    vehicle.color = "Rojo"
    vehicle.brand = "Toyota"
    vehicle.model = "Camry"
    vehicle.plates = "74A-5BD"

    if (vehicle.isTurnedOn) {
        println("Coche encendido.")
    } else {
        println("Coche apagado")
    }

    vehicle.turnOn()

    if (vehicle.isTurnedOn) {
        println("Coche encendido.")
    } else {
        println("Coche apagado")
    }

    println("Nivel de combustible ${vehicle.fuel}")

    vehicle.refuel(20)

    println("Nivel de combustible ${vehicle.fuel}")
}
