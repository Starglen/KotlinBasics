import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)
    println("Enter first number:")
    var a = read.nextInt()

    println("Enter second number:")
    var b = read.nextInt()

    println("Enter third number:")
    var c = read.nextInt()

    if ((a>=b)&&(a>=c)){
        println("$a is the largest number")
    }

    if ((b>=a)&&(b>=c)){
        println("$b is the largest number")
    }

    else{
        println("$c is the largest number")
    }

}