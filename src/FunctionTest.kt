fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b

//the arguments can have default value
fun sumDefault(a: Int = 100, b: Int = 2000) = a + b

// Unit type corresponds to the `void` type in Java.
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    println(sum(1, 2))
    println(sum2(1, 2))
    println(sumDefault(1, 2))
    println(sumDefault())
    printSum(1, 2)
}