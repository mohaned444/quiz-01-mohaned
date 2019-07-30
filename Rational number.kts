fun toDouble(Numerator: Int, Denominator: Int) : Double {
    var double: Double = (Numerator.toDouble() / Denominator.toDouble())
    return double
}

fun add(Numerator: Int, Denominator: Int, Numerator2: Int, Denominator2: Int) : Rational_number{
    var x = Denominator
    var z = Denominator2
    var y = z
    var a = y/x
    var b = Numerator + a
    var Numerator = b + Numerator2
    var Denominator = y
    return Rational_number(Neumirator, Denominator)

}