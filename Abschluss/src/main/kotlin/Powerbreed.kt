import java.lang.IndexOutOfBoundsException

class Powerbreed(name:String, hp:Int): Helden(name,hp) {

    fun heilungMilch(){
        this.hp=this.hp+60
        println("Name:${this.name},neue HP:${this.hp}")
    }

    fun tornado(gegner: Gegner) {
        gegner.schaden=gegner.schaden+300
        gegner.hp=gegner.hp-150
        println("${this.name}:${this.hp}")
        println("${gegner.name}:${gegner.hp}")
    }

    fun feuerExp(gegner: Gegner){
        gegner.schaden+=200
        gegner.hp-=100
        println("${this.name} hat HP wert:${this.hp}")
        println("Neue HP von ${gegner.name}:${gegner.hp}")

    }

    fun feuerloescher(){
        println("Feuer")
        println("Feuerlöscher benutz")
        this.schaden +=5
        this.hp-=-5
        println("Feuer ist gelöscht mit ${this.schaden}")
        println("Neue HP:${this.hp}")
    }

    override fun meinAktion(gegner: Gegner) {
        var aktion = 0
        println("Ausgewählte held ${this.name} und Hp wert:${this.hp}")
        println("wähle ein aktion von ${this.name}")
        println("1.heilungMilch")
        println("2.tornado")
        println("3.feuerExp")
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
            2 -> this.tornado(gegner)
            3 -> this.feuerExp(gegner)
            4 -> this.feuerloescher()
        }
    }
}