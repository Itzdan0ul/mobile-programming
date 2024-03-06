# Solución

### Por Urtiz López Dan Jair
1. Crear una clase que represente a un Vehículo, que tenga las siguientes propiedades y métodos:

Propiedades
- Color
- Marca
- Modelo
- Placas
- Encendido
- Gasolina

Métodos
- Encendido
- Apagar
- Recarga
```kotlin
open class Vehicle {
   var color: String = ""
   var brand: String = ""
   var model: String = ""
   var plates: String = ""
   var isTurnedOn: Boolean = false
   var fuel: Int = 67

   fun turnOn() {
      isTurnedOn = true
   }

   fun turnOff() {
      isTurnedOn = false
   }

   fun refuel(fuel: Int) {
      this.fuel += fuel
   }
}
```

2. Crea un objeto Vehículo y establece los datos de tu coche:
   - Color
   - Marca
   - Modelo
   - Placa
```kotlin
fun main() {
    val vehicle = Vehicle()

    vehicle.color = "Rojo"
    vehicle.brand = "Toyota"
    vehicle.model = "Camry"
    vehicle.plates = "74A-5BD"
}
```
3. Compruebe si el coche está en marcha (imprimiendo el estado del coche), arranque el coche y vuelva a comprobarlo.
```kotlin
fun main() {
   val vehicle = Vehicle()

   vehicle.color = "Rojo"
   vehicle.brand = "Toyota"
   vehicle.model = "Camry"
   vehicle.plates = "74A-5BD"

   if (vehicle.isTurnedOn) {
      println("Coche encendido.")
   } else {
      println("Coche apagado.")
   }

   vehicle.turnOn()

   if (vehicle.isTurnedOn) {
      println("Coche encendido.")
   } else {
      println("Coche apagado.")
   }
/* Este código de ejemplo produce la siguiente salida:
    Coche apagado.
    Coche encendido.
*/
}
```
4. Comprueba el nivel del depósito imprimiendo la cantidad de gasolina, rellena unos litros y vuelve a comprobar.
```kotlin
fun main() {
    val vehicle = Vehicle()

    vehicle.color = "Rojo"
    vehicle.brand = "Toyota"
    vehicle.model = "Camry"
    vehicle.plates = "74A-5BD"
   
    println("Nivel de combustible ${vehicle.fuel}")

    vehicle.refuel(20)

    println("Nivel de combustible ${vehicle.fuel}")

/* Este código de ejemplo produce la siguiente salida:
    Nivel de combustible 67
    Nivel de combustible 87
*/
}
```
5. Crea una clase Persona con los datos del constructor:
   - Nombre
   - Apellidos
   - Sexo
   - Altura
```kotlin
open class Person(name: String, lastname: String, gender: String, height: Float) {
    var name: String = name
    var lastname: String = lastname
    var gender: String = gender
    var height: Float = height
}
```
