fun main(){
    println(getMax( a=5 ,b = 4))
}

fun getMax(a: Int, b: Int) : Int{
    val max = if (a > b) a else b
    return max
}