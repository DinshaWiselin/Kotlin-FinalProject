class Madproff(name:String,hp:Int): Gegner (name,hp) {
    var shaden = 0
   // var badAssist: BadAssist = BadAssist("Bad Assistant", 1000)
    var lebencheck=false

    fun helferCasten(family: MutableList<Helden>,badAssist:Gegner) {
        lebencheck=true
        println("Mad proffesor und Bad Assistant Attack")
        println("--------------------------------------")
        println("Der gegner castet Hilfe")
        println("Entgegner name ist ${badAssist.name} und Hp wert:${badAssist.hp}")

    }




    fun vereisen(helden: Helden) {
        println("${helden.name}:${helden.hp}")
        var hp = helden.hp * 0.20
        do {
            schaden = (helden.hp * 0.10).toInt()
            helden.hp -= schaden
        } while (helden.hp > hp)

        println("${this.name}:${this.hp}")
        println("am ende ${helden.name}:${helden.hp}")
    }
}
