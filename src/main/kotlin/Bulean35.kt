

fun main() {

    var x1:Int = 3
    var y1:Int = 2
    var x2:Int = 1
    var y2:Int = 4
    val bulean35 = Bulean35(x1, y1, x2, y2)

//    Qudrat Abdurimov Boolean 35 - 37

    println(bulean35.birXil())
    println(bulean35.ruh())
    println(bulean35.shoh())
}









class Bulean35 constructor(x1:Int,y1:Int,x2:Int,y2:Int){
    var x1:Int = 0
    var y1:Int = 0
    var x2:Int = 0
    var y2:Int = 0
    init {
        this.x1 = x1
        this.y1 = y1
        this.x2 = x2
        this.y2 = y2
    }

    fun birXil(): Boolean {
        return (x1 + y1) % 2 == (x2 + y2) % 2
    }
    fun ruh() : Boolean{
        return x1 - y1 == x2 - y2 || x1 + y1 == x2 + y2
    }
    fun  shoh() : Boolean{
        return x1 + y1 == x2 + y2 - 2 || x1 + y1 == x2 + y2 + 2
    }


}