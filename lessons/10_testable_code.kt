// Lesson 10: testable code and simple assertions.
// Run: kotlinc lessons/10_testable_code.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val names = listOf("Ada", "Grace", "Linus")
    val sorted = names.sorted()
    println(sorted)

    assert(sorted.first() == "Ada")
    assert(sorted.last() == "Linus")
    assert(isEven(10))

    println("All assertions passed.")
}

fun isEven(number: Int): Boolean = number % 2 == 0
