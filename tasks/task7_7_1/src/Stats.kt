I nme// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float {
    require(values.isNotEmpty()) { "List cannot be empty" }

    val sorted = values.sorted()
    val middle = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        (sorted[middle - 1] + sorted[middle]) / 2
    } else {
        sorted[middle]
    }
}

fun displayStats(values: List<Float>) {
    println("Minimum: ${values.minOrNull()}")
    println("Maximum: ${values.maxOrNull()}")
    println("Mean: ${values.average()}")
    println("Median: ${median(values)}")
}