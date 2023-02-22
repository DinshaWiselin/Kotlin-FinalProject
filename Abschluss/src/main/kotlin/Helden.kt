open class Helden(name:String,hp:Int) {

    var s:MutableList<Int> = mutableListOf(80,90,100)
    var schaden=s.random()
    var name:String=name
    var hp:Int=hp
    var heldSpielt:Boolean=false
    fun spielStorung(held1:Helden):Boolean{
        if (held1.hp>0) {
            held1.heldSpielt = true
            println("{${held1.name} lebt")

        }
        else{
            held1.heldSpielt = false
            println("{${held1.name} lebt nicht mehr")
        }
       return heldSpielt
    }
    open fun meinAktion(gegner: Gegner){

    }
}