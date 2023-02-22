open class Gegner (name:String,hp:Int){
    var s:MutableList<Int> = mutableListOf(80,90,100)
    var schaden=s.random()
    var name:String=name
    var hp:Int=hp

    open fun nitroglyzerinExp(helden: Helden){
        println("nitroglyzerinExp gegen ${helden.name}")
        helden.schaden+=100
        helden.hp-=helden.schaden
        this.hp+=100
        println("${this.name} hat HP wert:${this.hp}")
        println("Neue HP von ${helden.name}:${helden.hp}")

    }
    open fun chemiWurfelnExp(helden: Helden){
        println("chemiWurfelnExp gegen ${helden.name}")
        helden.schaden+=200
        helden.hp-=helden.schaden
        println("${this.name}:${this.hp},Schaden:$schaden")
        println("${helden.name} HP:${helden.hp},Schaden:${helden.schaden}")
    }
    open fun gasAmoniakEXp(helden: Helden){
        println("gasAmoniakEXp gegen ${helden.name}")
        helden.schaden+=200
        helden.hp-=helden.schaden
        println("${this.name}:${this.hp},Schaden:$schaden")
        println("${helden.name} HP:${helden.hp},Schaden:${helden.schaden}")
    }
    fun brennstoffExp(family:MutableList<Helden>){
        println("brennstoffExp gegen Helden familie")
       schaden(family)
    }
    open fun schaden(family:MutableList<Helden>){

        for (held in 0..family.size-1) {

            var schaden :Int= (family[held].hp * 0.10).toInt()
            family[held].hp -= schaden
            println("${this.name}:${this.hp}")
            println("${family[held].name}:${family[held].hp}")
        }
        }
}