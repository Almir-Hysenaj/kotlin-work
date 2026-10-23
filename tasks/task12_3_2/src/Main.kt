// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person("Joe", LocalDate(1997, 8, 23))
    val p2 = Person("Sarah", "2001-05-14")

    println("${p1.name}  ${p2.name}")
    println("${p1.birth}  ${p2.birth}")
    println("${p1.isMarried}  ${p2.isMarried}")

}