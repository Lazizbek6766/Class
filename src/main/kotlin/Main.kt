fun main() {
   val begin = Begin(4)
    begin.Peremetr()

    val i =6
    val yuza =i * i
    println( yuza)
    val x1 = 3
    val y1 = 4
    val x2 = 4
    val y2 = 2
    println((y2+y1)%2 == (x2+y2)%2)
}











class  Begin constructor(a : Int){
    var a = 0
    var P = 0
    init {
        this.a = a
    }
    fun Peremetr(){
        P = 4 * a
        println(P)
    }
}