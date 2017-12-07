//Closures: In Java you cannot change values of outside variable inside Lambdas
//in Kotlin you can

fun main(args: Array<String>) {

    val program = ProgramC()
    var result = 0

    val myLambda: (Int, Int) -> Int = {x,y -> x+y}
    program.addTwoNumbers(2,7)  {x,y -> result = x+y}

    println(result)
}

class ProgramC{
    fun addTwoNumbers(a: Int, b:Int, action: (Int, Int) -> Unit){
        val result =  action(a,b) // result = x + y = a + b = 2 + 7 = 9
        println("Result of HighLebelFunctions: " + result)
    }
}