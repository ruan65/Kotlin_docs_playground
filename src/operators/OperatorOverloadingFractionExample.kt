package operators

data class Fraction(val numerator: Int, val denominator: Int) {

    operator fun plus(add: Fraction) =
            if (denominator == add.denominator) {
                Fraction(numerator + add.numerator, denominator)
            } else {
                Fraction(numerator * add.denominator + denominator * add.numerator,
                        denominator * add.denominator)
            }

    operator fun times(num: Int) = Fraction(numerator * num, denominator)

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}


fun main(args: Array<String>) {

    val two_third = Fraction(2, 3)
    val three_fourth = Fraction(3, 4)

    println(two_third * 2)

    println(two_third + three_fourth)
}