// Task 12.4.1: main program
fun main() {
    val c = Circle(Point(0.0, 0.0), 5.0)

    println(c.area())
    println(c.perimeter())

    println(c.contains(Point(3.0, 4.0))) // true
    println(c.contains(Point(6.0, 0.0))) // false
}