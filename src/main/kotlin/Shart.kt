import kotlin.math.abs

fun main() {
    val a = 10
    val b = 10
    val c = 35


    val d = 45
    val shart = Shart(a, b, c)



//    Qudrat Abdurimov if 15 dan 21 gacha
    shart.yigindiKatta()
    shart.osuvchiSonlar()
    shart.osuvchiSonlar2()
    println(shart.tartibRaqami())
    println(shart.tartibRaqami2(d))
    shart.engYaqin()


}















class Shart(a: Int, b: Int, c: Int) {
    var a = 0
    var b = 0
    var c = 0

    init {
        this.a = a
        this.b = b
        this.c = c
    }

    fun yigindiKatta() {
        if (a + b > a + c && a + b > b + c){
            println("$a $b")
        }

        if (a + c > b + c && a + c > b + a){
            println("$a $c")
        }

        if (c + b > a + c && c + b > b + a){
            println("$c $b")
        }
    }
    fun osuvchiSonlar(){
        if (a<b && b<c){
            a *= 2
            b *= 2
            c *= 2
            println("$a $b $c")
        }else{
            a = -a
            b = -b
            c = -c
            println("$a $b $c")
        }
    }
    fun osuvchiSonlar2(){
        if ((a<b && b<c) || (a>b && b>c)){
            a *= 2
            b *= 2
            c *= 2
            println("$a $b $c")
        }else{
            a = -a
            b = -b
            c = -c
            println("$a $b $c")
        }
    }

    fun tartibRaqami():Int {
        if (a == b){
            return 3
        }
        if (a == c){
            return 2
        }
        if (b == c){
            return 1
        }
        return 0
    }
    fun tartibRaqami2(d : Int):Int {
        if (a == b && b == c){
            return 4
        }
        if (a == b && b == d){
            return 3
        }
        if (a == c && c == d){
            return 2
        }
        if (b == c && c == d){
            return 1
        }
        return 0
    }
    fun engYaqin(){
        val masofa1 = abs(a - b)
        val masofa2 = abs(a - c)
        if (masofa1<masofa2){
            println("b = $b masofa $masofa1")
        }else{
            println("c = $c masofa $masofa2")
        }
    }

}