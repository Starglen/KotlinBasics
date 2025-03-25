import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number:")
    var x = read.nextInt()

    println("Enter the operator:")
    var operator = read.next()

    println("Enter second number:")
    var y = read.nextInt()

    val results = when(operator){
        "+" -> x + y
        "/" -> x / y
        "-" -> x - y
        "*" -> x * y
        else -> ("Invalid Operator")
    }
    println("Answer = $results")

}