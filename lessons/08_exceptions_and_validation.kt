// Lesson 8: exceptions, validation, and safe error handling.
// Run: kotlinc lessons/08_exceptions_and_validation.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    try {
        val value = parseAge("-3")
        println("Age: $value")
    } catch (e: IllegalArgumentException) {
        println("Validation error: ${e.message}")
    }

    try {
        val result = divide(10, 0)
        println("Result: $result")
    } catch (e: ArithmeticException) {
        println("Cannot divide by zero")
    }

    // Try it: add an input checker for blank names and names longer than 20 characters.
}

fun parseAge(raw: String): Int {
    val age = raw.toIntOrNull() ?: throw IllegalArgumentException("Age must be a valid number")
    require(age >= 0) { "Age cannot be negative" }
    return age
}

fun divide(a: Int, b: Int): Int = if (b == 0) throw ArithmeticException("Divide by zero") else a / b
