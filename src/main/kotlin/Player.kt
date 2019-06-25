
class Player( val name: String, var level: Int = 1, var score: Int = 0, var lives: Int = 3) {

    fun show(){
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            """)
    }
}