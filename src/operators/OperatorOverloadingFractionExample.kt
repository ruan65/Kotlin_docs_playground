package operators

data class Fraction(val numerator: Int, val denominator: Int) {

//    operator fun plus(add: Fraction) =
//            if (denominator == add.denominator) {
//                Fraction(numerator + add.numerator, denominator)
//            } else {
//                val a =
//            }

    operator fun times(num: Int) = Fraction(numerator * num, denominator)

    override fun toString(): String {
        return "$numerator/$denominator"
    }
}


fun main(args: Array<String>) {

    val two_third = Fraction(2, 3)

    println(two_third * 2)
}