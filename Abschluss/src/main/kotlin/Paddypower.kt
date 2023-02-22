import java.lang.IndexOutOfBoundsException

class Paddypower(name:String, hp:Int): Helden(name,hp){


    fun heilungMilch(){
        println("${this.name} nimmt heilungMilch")
         this.hp=this.hp+50
        println("${this.name}hat neue HP wert:${this.hp}")

    }

   fun flut(gegner: Gegner){
       println("Flut attack gegen ${gegner.name} ")
    gegner.schaden=gegner.schaden+100
        gegner.hp=gegner.hp-this.schaden
        println("${this.name} hat hp wert ${this.hp}")
        println("${gegner.name} hat neue hp wert ${gegner.hp}")
    }

    fun erdbeben(gegner: Gegner){
        println("Erdbeben attack gegen ${gegner.name} ")
        gegner.schaden=gegner.schaden+150
        gegner.hp=gegner.hp-150
        println("${this.name} hat hp wert ${this.hp}")
        println("${gegner.name} hat neue hp wert:${gegner.hp}")
    }
    fun feuerloescher(){
         println("Feuer")
         println("Feuerlöscher benutz")
         this.schaden +=10
         this.hp-=-10
         println("Feuer ist gelöscht mit ${this.schaden} shaden")
         println("Neue HP:${this.hp}")
    }

    override fun meinAktion(gegner: Gegner) {
        var aktion = 0
        println("Ausgewählte held ${this.name} und Hp wert:${this.hp}")
        println("\nwähle ein aktion von ${this.name}")
        println("1.heilungMilch")
        println("2.flut")
        println("3.erdbeben")
        println("4.feuerLoescher")
        while(true){
            try {
                aktion = readln().toInt()
                if (aktion>4)
                    throw IndexOutOfBoundsException()
                break
            }
            catch (ex:Exception){
                println("Bitte richtige auswahl eingeben")
            }
        }
        when (aktion) {
            1 -> this.heilungMilch()
            2 -> this.flut(gegner)
            3 -> this.erdbeben(gegner)
            4 -> this.feuerloescher()
        }
    }
}