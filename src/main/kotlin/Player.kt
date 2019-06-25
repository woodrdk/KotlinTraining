
class Player( val name: String, var level: Int = 1, var score: Int = 0, var lives: Int = 3) {

    var weapon: Weapon = Weapon( "Fist" ,1)

    private val inventory = ArrayList<Loot>()

    fun show(){
        if(lives > 0 ){
            println("$name is alive")
        }
        else{
            println("$name is dead")
        }
    }

    override fun toString(): String{
        return  """
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon: $weapon
            """
    }

    fun getLoot(item: Loot){
        inventory.add(item)
        // code to save inventory goes here
    }

    fun dropLoot (item: Loot): Boolean{
        return if(inventory.contains(item)) {
            inventory.remove(item)
            true
        }
        else{
            false
        }
    }
//
//    fun dropLoot(name: String): Boolean{
//        var result = false
//        for (item in inventory){
//            if( item.name== name){
//                inventory.remove(item)
//                result = true
//                break
//            }
//        }
//    }

    // other way
    fun dropLoot(name: String): Boolean{
        println("$name will be dropped")
        for(item in inventory){
            if(item.name == name ){
                inventory.remove(item)
                return true
            }
        }
        return false
    }


    fun showInventory(){
        var total = 0.00
        println("$name's Inventory")
        for ( item in inventory){
            println(item)
            total += item.value
        }
        //println(inventory.get(0))
        println("====================")
        println("Total value is $total")
        println("====================")
    }
}