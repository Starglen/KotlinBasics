import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Entre day(number):")
    var day = read.nextInt()

    var results = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "saturday"
        7 -> "Sunday"
        else -> "Invalid number of day in a week"
    }
    println("Day $day corresponds to $results ")

}