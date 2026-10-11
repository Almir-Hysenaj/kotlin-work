// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(t: Triangle): Boolean {
    return t.first < t.second + t.third && t.second < t.first + t.third && t.third < t.first + t.second
}

fun triangleArea(t: Triangle): Double{
    val (a, b, c) = t
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}