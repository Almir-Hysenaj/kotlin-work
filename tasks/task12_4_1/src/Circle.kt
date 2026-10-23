// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double){
    init {
        require(radius > 0.0) {"Radius must be positive"}
    }

    fun area() = PI * radius * radius

    fun perimeter() = 2 * PI * radius

    fun contains(p: Point) = centre.distanceTo(p) <= radius
}