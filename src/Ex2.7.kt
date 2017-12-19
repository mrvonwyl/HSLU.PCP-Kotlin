package excercises

fun main(args: Array<String>){
    val a = 3
    val b = 4

    println(sum(a, b))
}

fun sum(f1: Int, f2: Int): Int{
    if(f2 == 0){
        return 0
    }

    return sum(f1, f2 - 1) + f1
}

