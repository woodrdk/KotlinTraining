fun main(args: Array<String>) {

//    val enemy = Enemy ("Dracula", 10,3)
//    println(enemy)
//
//    enemy.takeDamage(4)
//    println(enemy)
//
//    enemy.takeDamage(11)
//    println(enemy)

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)

    uglyTroll.takeDamage(8)
    println(uglyTroll)

    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampire("Vlad")
    println(vlad)
    vlad.takeDamage(8)
    println(vlad)

    val draven = VampireKing("Draven")
    println(draven)
    draven.takeDamage(20)
    println(draven)
}


fun oldVids(){
//    println("Hello World!")
//    println("My next KOTLIN program.")
//    val bob = "Dracula"
//    val rob = "Rob Wood" // declares a string of Rob Wood
//    println("My name is $rob")                 // prints the var rob
//
//    val rob2 = "Rob Wood 2"
//
//    println("My name is $rob2")
//    println("My name is ${rob + " " + rob2}")
//
//    val income = 82
//    val monthly = income * 4
//    println("My income is $income")
//    println("My monthly income is $monthly")
//
//    println()
//
//    val apples = 6
//    val oranges = 5
//    val fruit: Int = apples + oranges
//    println("I Have $fruit pieces of fruit")
//    println(apples / 4)
//    println("A quarter of the apples is ${apples / 4}")
//
//
//    println()
//    val weeks = 130
//    val years: Double  = weeks / 52.0
//    println("$weeks weeks is $years years")
//    println(years)
//
//    println("My name is $rob")
//    println("My name is $bob")
//
//    //    val lives = 3
////
////    var isGameOver = ( lives < 1 )
////    println(isGameOver)
////    if (isGameOver){
////        println("Game over!")
////    }
////    else{
////        println("You have $lives lives left")
////    }
//
//    println("How old are you: ")
//    val age = readLine()!!.toInt()
//    println("Age is $age")
//
//    val message: String
//    message = when{
//        age < 18 -> "You're too young to vote"
//        age == 100 -> "Congratulations"
//        else -> "You can vote"
//    }
//
////    message = if (age < 18){
////        "You're too young to vote"
////    }
////    else if (age == 100){
////        "Congratulations"
////    }
////    else{
////        "You can vote"
////    }
//    println(message)
//
//

    for ( i in 0 until 10){
        println("$i squared is ${i*i}")
    }
    println()
    for ( i in 0..10){
        println("$i squared is ${i*i}")
    }
    println()
    for ( i in 10 downTo 0){
        println("$i squared is ${i*i}")
    }

    println()
    for ( i in 10 downTo 0 step 2){
        println("$i squared is ${i*i}")
    }

    println()
    for ( i in 3..100){
        if(i % 3 == 0 && i % 5 == 0){
            println(i)
        }
    }

    println()
    for ( value in 3..100 step 3){
        if(value % 5 == 0){
            println(value)
        }
    }

// game code
    val rob = Player("Rob")
    rob.show()

    val hill = Player("Hillary", 5)
    hill.show()

    val jen = Player("Jen", 4,0, 8)
    jen.show()

    val cass = Player ("Cassandra", 2, 1000,5)
    cass.show()
    println(cass.weapon.name.toUpperCase())
    println(cass.weapon.damageInflicted)

    val axe = Weapon ("Axe", 12)
    jen.weapon = axe
    println(jen.weapon.name)
    println(axe.name)
    axe.damageInflicted = 24
    println(axe.damageInflicted)

    println(jen.weapon.damageInflicted)

    hill.weapon = Weapon ("Sword", 10)
    println(hill.weapon.name)
    cass.weapon = hill.weapon
    cass.show()
    hill.weapon = Weapon("Spear", 14)
    println(hill.weapon.name)
    hill.show()

    val redPotion = Loot("Red Potion", LootType.POTION,7.50)
    hill.getLoot(redPotion)

    hill.showInventory()

    println(hill)

    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 00.00)
    hill.getLoot(chestArmor)

    hill.getLoot(Loot("Ring of protection +2", LootType.RING, 40.25))
    hill.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))
    hill.showInventory()
    if( hill.dropLoot(redPotion)){
        hill.showInventory()
    }
    else{
        println("You dont have a ${redPotion.name}")
    }
    val bluePotion = Loot ("Blue Potion", LootType.POTION,6.00)

    if (hill.dropLoot(bluePotion)){
        hill.showInventory()
    }
    else{
        println("You do not have ${bluePotion.name}")
    }

    hill.dropLoot("Invisibility Potion")
    println("============================")
    hill.showInventory()

}