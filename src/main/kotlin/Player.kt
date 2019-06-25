
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

    fun showInventory(){
        println("$name's Inventory")
        for ( item in inventory){
            println(item)
        }
        //println(inventory.get(0))
        println("====================")
    }
}