class Beutel {
    var beutel:MutableList<String> = mutableListOf("heiltrank","heiltrank","heiltrank","vitamine")
    //var beutelUsed=false
    fun beutelNutz(held1:Helden){
        if (beutel.isEmpty())

            println("beutel is empty")

        else {
            println("\n${held1.name} ist schwah...Beutel benutz")
            println("\nWähle ein beutel inhalt")
            for (i in 0..beutel.size - 1) {
                println("${i + 1}.${beutel[i]}")
            }
            var option = readln().toInt()
            if (option == 1||option ==2||option ==3)
                heiltranknutzung(held1)
            else if (option ==4)
                vitaminenutzung(held1)
        }
    }
    fun heiltranknutzung(held1:Helden){
        println("\n${held1.name} nimmt heiltrank")
        var heal:Int=50
            //(held1.hp*0.50).toInt()
        held1.hp=held1.hp+heal
        beutel.remove("heiltrank")
        println("${held1.name} hat Hp wert ${held1.hp}")
      // beutelUsed=true

    }

    fun vitaminenutzung(held1:Helden){
        println("\n${held1.name} nimmt vitamine")
        //held1.schaden+=(held1.schaden*1.1).toInt()
        held1.hp+=60
        beutel.remove("vitamine")
        println("${held1.name} hat Hp wert:${held1.hp}")
       // beutelUsed=true
    }
}