import java.lang.IndexOutOfBoundsException
import java.net.ProtocolFamily
//class mit helden und gegner attack
class Schwefelpark(var held1:Monkikimomo,var held2:Paddypower,var held3:Powerbreed,var gegner: Gegner) {
    var family: MutableList<Helden> = mutableListOf(held1,held2,held3)
    var spielHelden:MutableList<Helden> = mutableListOf()
    var heldSpielt: Boolean = false

     //funtion für helden attack
    fun heldenattack(gegner: Gegner) {
        var heldAuswahl: Int = 0  //eingabe variable held
        var aktion: Int = 0       //eingabe variable aktion

         if (gegner.hp > 0) {
             if (spielHelden.isEmpty()) {
                 for (held in 0..family.size - 1) {
                     if (family[held].hp > 0) {
                         spielHelden.add(family[held])
                     } /*else {
                         family[held].hp = 0
                         spielHelden.add((family[held]))
                     }*/
                 }
             }
             var i = spielHelden.size
             while (i > 0) {
                 println("\n\n\nWähle eine held aus der liste ein\n")
                 for (held in 0..spielHelden.size - 1) {
                     println("${held + 1}.${family[held].name} HP:${family[held].hp}")
                 }
                 while (true) {
                     try {
                        heldAuswahl = readln().toInt()
                         if (heldAuswahl>spielHelden.size)
                             throw IndexOutOfBoundsException()
                         break
                     } catch (ex: Exception) {
                         println("Falsche eingabe")
                     }
                 }
                 spielHelden[heldAuswahl - 1].meinAktion(gegner)   //Helden Aktion aufruffen
                 i--
             }
         }

    }



    fun enenyattack(madproff: Madproff, helden: Helden) {
        println("\n\nEntgegner name ist ${gegner.name} und Hp wert:${gegner.hp}")
        var aktioinlist: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

        if (madproff.hp >0 && helden.hp>0) {
            var aktion = aktioinlist.random()
            when (aktion){
                1 -> gegner.nitroglyzerinExp(helden)
                2 -> gegner.chemiWurfelnExp(helden)
                3 -> gegner.gasAmoniakEXp(helden)
                4 -> gegner.brennstoffExp(family)
                5 -> madproff.vereisen(helden)
            }
        }
    }

    /*fun spielStorung(held:Helden):Boolean{
        if (held.hp>0) {
            held.heldSpielt = true
            println("{${held1.name} lebt")

        }
        else{
            held1.heldSpielt = false
            println("{${held1.name} lebt nicht mehr")
        }
        return heldSpielt
    }

     */

}



