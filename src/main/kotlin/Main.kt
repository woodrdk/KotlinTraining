fun main(args: Array<String>) {
    println("Hello World!")
    println("My next KOTLIN program.")

    var rob: String = "Rob Wood" // declares a string of Rob Wood
    println(rob)                 // prints the var rob

    var rob2: String
    rob2 = "Rob Wood 2"

    println(rob2)
    println(rob + " " + rob2)

    var income: Int = 82
    var monthly: Int = income * 4
    println(income)
    println(monthly)

    println()

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples + oranges
    println(fruit)
    println(apples / 4)

    println()
    val weeks: Int = 130
    val years: Double  = weeks / 52.0
    println("$weeks weeks is $years years")
    println(years)
    println("My name is $rob")
}