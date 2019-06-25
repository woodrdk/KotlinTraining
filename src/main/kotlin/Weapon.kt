
class Weapon(val name: String, var damageInflicted: Int) {

    override fun toString(): String{
        return  "The weapon $name inflicts $damageInflicted damage points"

    }
}