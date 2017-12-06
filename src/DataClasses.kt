fun main(args: Array<String>){
    val f1 = Foo("a", 1)
    val f2 = Foo("b" ,2)
    val f3 = f1.copy()

    println(f1.equals(f3))
}

data class Foo(val a: String, val b: Int)