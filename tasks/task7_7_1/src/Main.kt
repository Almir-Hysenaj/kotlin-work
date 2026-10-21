// Task 7.7.1: program to compute stats for a numeric dataset
fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Please provide a filename")
        return
    }

    val values = readData(args[0])
    displayStats(values)
}