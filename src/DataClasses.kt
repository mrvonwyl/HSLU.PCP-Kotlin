fun main(args: Array<String>){
    val f1 = Foo("a", 1)
    val f2 = f1.copy()
    val f3 = f1.copy()
    f3.a = "b"

    // == calls equals
    // https://stackoverflow.com/questions/45772946/equality-in-kotlin
    println(f1 == f2)
    println(f3 == f1)

    // implicit toString()
    println(f3)
}

// var = mutable, val = immutable
data class Foo(var a: String, val b: Int)