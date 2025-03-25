import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter your firstname :")
    var firstname = readln()
    println("Hello there, $firstname")

    println("Enter your age:")
    var age = read.nextInt()
    println("$firstname is $age Years old")

    println("Enter your Weight(kg):")
    var weight = read.nextDouble()
    println("Your weight is $weight kilograms")


}