//Closures: In Java you cannot change values of outside variable inside Lambdas
//in Kotlin you can

fun main(args: Array<String>) {

    val program = Program()
    var result = 0

    program.addTwoNumbers(2,7)  {x,y -> result = x+y}

    println(result)
}

class Program{
    fun addTwoNumbers(a: Int, b:Int, action: (Int, Int) -> Unit){
        action(a,b) // result = x + y = a + b = 2 + 7 = 9
    }
}



