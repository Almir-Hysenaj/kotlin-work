// COMP2850 Portfolio: Week 3
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double, Double, Double>

fun isValidTriangle(t: Triangle): Boolean {
    return t.first < t.second + t.third &&
            t.second < t.first + t.third &&
            t.third < t.first + t.second
}

fun triangleArea(t: Triangle): Double {
    if (!isValidTriangle(t)) {
        throw IllegalArgumentException("Invalid triangle")
    }

    val (a, b, c) = t
    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
}