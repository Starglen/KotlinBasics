// Lesson 8: exceptions, validation, and defensive coding.
// Run: kotlinc lessons/08_exceptions_and_validation.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    try {
        println(parseAge("21"))
        println(parseAge("-1"))
    } catch (e: IllegalArgumentException) {
        println("Caught: ${e.message}")
    }

    try {
        println(divide(10, 0))
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }
}

fun parseAge(value: String): Int {
    val age = value.toIntOrNull() ?: throw IllegalArgumentException("Age must be a number")
    require(age >= 0) { "Age cannot be negative" }
    return age
}

fun divide(a: Int, b: Int): Int {
    if (b == 0) throw ArithmeticException("Divide by zero")
    return a / b
}
