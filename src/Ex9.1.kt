fun main(args: Array<String>) {

val names: MutableList<String> = mutableListOf("Joe", "Tara", "Sue", "Tim");
val x = names
        .filter{s -> s.startsWith("H")}
        .map {s -> s.toUpperCase() }
        //.reduce({ a, b -> a + " " + b })
        .fold(""){s,t -> s + " " + t}

    println(x.length)
}