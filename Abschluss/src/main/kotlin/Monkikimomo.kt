import java.lang.IndexOutOfBoundsException

class Monkikimomo(name:String, hp:Int): Helden(name, hp){

    fun heilungMilch(){
        println("\nHeilungmilch benutz")
        this.hp+=100
        println("Name:${this.name} hat neue HP:${this.hp},Schaden:$schaden")
    }

    fun wasserStrahlLutscher(gegner: Gegner) {
        println("\nWasserStrahl Lutscher benutz gegen ${gegner.name}")
        gegner.schaden=gegner.schaden+100
        gegner.hp=gegner.hp-100
        println("${this.name}:${this.hp},Schaden:$schaden")
        println("${gegner.name} HP:${gegner.hp},Schaden:${gegner.schaden}")

    }

   fun feuerBonbon(gegner: Gegner){
       println("\nFeuerBonbon Lutscher benutz gegen ${gegner.name}")
       gegner.schaden+=100
       gegner.hp=gegner.hp-this.schaden
       println("${this.name}:${this.hp},Schaden:$schaden")
       println("${gegner.name} HP:${gegner.hp},Schaden:${gegner.schaden}")
    }
     fun feuerLoescher(){
         println("Feuer")
         println("Feuerlöscher benutz")
             this.schaden +=10
         this.hp-=-10
         println("Feuer ist gelöscht mit ${this.schaden} schaden")
         println("${this.name} hat hp wert :${this.hp},Schaden:$schaden")
    }

    override fun meinAktion(gegner: Gegner) {
        var aktion: Int = 0
        println("\nwähle ein aktion von ${this.name}\n")
        println("1.heilungMilch")
        println("2.wasserStrahlLutscher")
        println("3.feuerBonbon")
        println("4.feuerLoescher")

            while (true) {
                try {
                    aktion = readln().toInt()
                   if (aktion>4)
                     throw IndexOutOfBoundsException()
                    break
                } catch (ex: Exception) {
                    println("Bitte richtige auswahl eingeben")
                }
            }

            when (aktion) {
                1 -> heilungMilch()
                2 -> wasserStrahlLutscher(gegner)
                3 -> feuerBonbon(gegner)
                4 -> feuerLoescher()
            }
        }

}