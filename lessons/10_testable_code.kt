// Lesson 10: simple testing patterns with assertions.
// Run: kotlinc lessons/10_testable_code.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val numbers = listOf(2, 4, 6, 8)
    assert(numbers.size == 4)
    assert(numbers.all { it % 2 == 0 })
    assert(isEven(12))

    println("All checks passed")
}

fun isEven(value: Int): Boolean = value % 2 == 0
