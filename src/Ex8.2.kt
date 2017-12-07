fun main(args: Array<String>) {

    val numbers: IntArray = intArrayOf(1, 2, 3, 5, 8)
    printNumbersAndSquares(numbers)
}

fun printNumbersAndSquares(numbers: IntArray){
    val numberlist: List<Int> = numbers.asList()
    numberlist.forEach{number -> println(number.toString() + ": " + number * number)}
}