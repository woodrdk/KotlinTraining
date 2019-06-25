fun main(args: Array<String>) {
//    val lives = 3
//
//    var isGameOver = ( lives < 1 )
//    println(isGameOver)
//    if (isGameOver){
//        println("Game over!")
//    }
//    else{
//        println("You have $lives lives left")
//    }

    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("Age is $age")

    val message: String
    message = when{
        age < 18 -> "You're too young to vote"
        age == 100 -> "Congratulations"
        else -> "You can vote"
    }

//    message = if (age < 18){
//        "You're too young to vote"
//    }
//    else if (age == 100){
//        "Congratulations"
//    }
//    else{
//        "You can vote"
//    }
    println(message)

}


fun oldVids(){
    println("Hello World!")
    println("My next KOTLIN program.")
    val bob = "Dracula"
    val rob = "Rob Wood" // declares a string of Rob Wood
    println("My name is $rob")                 // prints the var rob

    val rob2 = "Rob Wood 2"

    println("My name is $rob2")
    println("My name is ${rob + " " + rob2}")

    val income = 82
    val monthly = income * 4
    println("My income is $income")
    println("My monthly income is $monthly")

    println()

    val apples = 6
    val oranges = 5
    val fruit: Int = apples + oranges
    println("I Have $fruit pieces of fruit")
    println(apples / 4)
    println("A quarter of the apples is ${apples / 4}")


    println()
    val weeks = 130
    val years: Double  = weeks / 52.0
    println("$weeks weeks is $years years")
    println(years)

    println("My name is $rob")
    println("My name is $bob")

}