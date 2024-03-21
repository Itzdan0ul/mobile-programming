class NationalLowSeason(city: String) : National(city), IPromotion, ICancel {
    override  val discount: Int = 10
    override val typeDiscount: Int = 0

    override fun getPrice(numDays: Int): Float {
        val amount = super.getPrice(numDays)
        return if (amount == 0f) 0f else getDiscountPrice(amount)
    }
}
