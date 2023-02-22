fun main() {
    //Helden Famielie
    var monkikimomo: Monkikimomo = Monkikimomo("Monki kimomo", 300)
    var paddypower: Paddypower = Paddypower("Paddy power", 500)
    var powerbreed: Powerbreed = Powerbreed("Power breed", 800)

    //Helden List
    var family: MutableList<Helden> = mutableListOf(monkikimomo, paddypower, powerbreed)

    //Entgegner und seine Helfer
    var madproff: Madproff = Madproff("Mad proffesor", 1500)
    var badAssist: BadAssist = BadAssist("Bad Assistant", 1000)

    //Helden und gegner attacke
    var schwefelpark: Schwefelpark = Schwefelpark(monkikimomo, paddypower, powerbreed, madproff)

    //Beutel
    var beutel:Beutel=Beutel()

    var boolean=true
    var i=1

    //attack zwischen Helden und enemy
    while (boolean) {
        var beutelUsed=false

        //Ausgabe Helden Famielie
        println("Helden Famielie")
        for (held in 0..family.size - 1) {
            println("Name:${family[held].name},HP: ${family[held].hp},shaden wert:${family[held].schaden} ")

        }


        //Ausgabe gegner
        println("Gegner")
        println("Name:${madproff.name},HP:${madproff.hp},Schaden wert:${madproff.schaden}")


        //level1
        println("\n\n")
        println("                                     Level:$i")
        println("                                  Helden attack")
        println("                              --------------------")


        //Helden attack
        schwefelpark.heldenattack(madproff)

        //prüft ob gegner lebt
        if (madproff.hp>0) {
            println("                                   Gegner attack")
            println("                                --------------------")

            //Gegner attack
            schwefelpark.enenyattack(madproff, family.random())
            i++

            //Ausgabe nach dem Attacken
            for (held in 0..family.size - 1) {
                println("Name:${family[held].name},HP: ${family[held].hp},shaden wert:${family[held].schaden}\n ")
                if (family[held].hp<=150) {
                    if (!beutelUsed) {
                        beutel.beutelNutz(family[held])  //beutel nutzung
                        beutelUsed = true
                    }
                    // family[held].spielStorung(family[held]) //prüft nach helden leben
                }
                println("Name:${madproff.name},HP:${madproff.hp},Schaden wert:${madproff.schaden}\n")
            }

        }
            //Prüft ob gegner schwach then Helfer casten
            if (madproff.hp in 1..700 && madproff.lebencheck == false) {
                println("Mad Proffesor schwach")
                println("--------------------")
                madproff.helferCasten(family, badAssist)

                //Prüft alle helden hp und helfer hp werten grässer als 0
                while (badAssist.hp >= 0 || monkikimomo.hp >= 0 && paddypower.hp >= 0 && powerbreed.hp >= 0) {
                    println("                                     Bad assistant attack")
                    println("                                    --------------------")
                    badAssist.badassisAttack(family, badAssist)
                    println("${madproff.name}${madproff.hp}")
                    println("${badAssist.name}:${badAssist.hp}")
                    println("                                     Helden attack")
                    println("                                  --------------------")
                    schwefelpark.heldenattack(badAssist)
                    if (badAssist.hp <= 0) {
                        println("\n\n\nGegner Bad assistant is tot")
                        break
                    }
                }
            }


        //prüft ob gegner lebt
        if (madproff.hp <= 0) {
            boolean = false
            println("Entgegner ist tot")
            println("Spiel Ende")
            println("Helden haben gewonnen")
        }

        //prüft ob Helden noch leben
        if (monkikimomo.hp <= 0 && paddypower.hp <= 0 && powerbreed.hp <= 0) {
            boolean = false
            println("Helden sind tot")
            println("Spiel Ende")
            println("Entgegner hat gewonnen")
        }

        }

    }
