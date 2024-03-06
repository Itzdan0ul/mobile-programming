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
