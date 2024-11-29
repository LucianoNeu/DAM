fun Signo(a:Int): Int{
    if (a < 0){
        return -1
    }
    else if (a > 0){
        return 1
    }
    else{
        return 0
    }
}

fun main() {
    println("Introduce un numero: ")

    val numero = readLine()?.toInt()

    println(Signo(numero))
}