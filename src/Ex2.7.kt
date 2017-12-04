package excercises

fun main(args: Array<String>){
    if (args.size != 2) {
        println("Please provide two factors as arguments")
        return
    }

    println(sum(args[0].toInt(), args[1].toInt()))
}

fun sum(f1: Int, f2: Int): Int{
    if(f2 == 0){
        return 0
    }

    return sum(f1, f2 - 1) + f1
}

