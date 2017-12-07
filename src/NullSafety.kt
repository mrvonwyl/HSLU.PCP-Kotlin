fun main(args: Array<String>) {
    val b: String? = null

    //returns null
    val l = b?.length

    // returns default value: 0
    val n = b?.length ?: 0

    //throws NPE
    //val e = b!!.length
    println(l)
    println(n)
}
