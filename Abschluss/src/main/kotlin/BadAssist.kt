class BadAssist(name:String,hp:Int): Gegner (name,hp){
    /*init {
        println("Ich bin ${name}.Mein HP wert ist:${hp}")
    }*/
    fun badassisAttack(family: MutableList<Helden>,badAssist:Gegner){
        var aktioinlist: MutableList<Int> = mutableListOf(1, 2, 3, 4)
        var aktion = aktioinlist.random()
        when (aktion) {
            1 -> badAssist.nitroglyzerinExp(family.random())

            2 -> badAssist.chemiWurfelnExp(family.random())
            3 -> badAssist.gasAmoniakEXp(family.random())
            4 -> badAssist.schaden(family)
        }
    }

    override fun nitroglyzerinExp(helden: Helden){
        println("Bad ASSistant attakiert nitroglyzerinExp gegen ${helden.name}")
        helden.hp-=100
        println("${this.name} hat HP wert:${this.hp}")
        println("Neue HP von ${helden.name}:${helden.hp}")

    }
    override fun chemiWurfelnExp(helden: Helden){
        println("Bad ASSistant attakiert  chemiWurfelnExp gegen ${helden.name}")
        helden.hp-=100
        println("${this.name} hat HP wert:${this.hp}")
        println("Neue HP von ${helden.name}:${helden.hp}")
    }
    override fun gasAmoniakEXp(helden: Helden){
        println("Bad ASSistant attakiert  gasAmoniakEXp gegen ${helden.name}")
        helden.hp-=200
        this.hp+=200
        println("${this.name} hat HP wert:${this.hp}")
        println("Neue HP von ${helden.name}:${helden.hp}")
    }
    override fun schaden(family:MutableList<Helden>){
     println("bad assistan attack gegn ganze helden famielie")
        for (held in 0..family.size-1) {
            println("Bad ASSistant  gegen ${family[held].name}")
            var schaden :Int= (family[held].hp * 0.05).toInt()
            family[held].hp -= schaden
            println("${this.name}:${this.hp}")
            println("${family[held].name}:${family[held].hp}")
        }
    }

}