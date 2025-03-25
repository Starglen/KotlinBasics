import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter room temperature:")
    var temperature = read.nextInt()
    if(temperature<25){
        println("The temperature is low")
    }
    else{
        ("The temperature is high")
    }
}