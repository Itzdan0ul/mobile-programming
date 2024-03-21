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
