// Lesson 4: collections, transformations, and null safety.
// Run: kotlinc lessons/04_collections_and_null_safety.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val numbers = listOf(3, 8, 12, 5)
    val doubled = numbers.map { it * 2 }
    val evens = numbers.filter { it % 2 == 0 }

    println("Numbers: $numbers")
    println("Doubled: $doubled")
    println("Even numbers: $evens")
    println("Largest: ${numbers.maxOrNull()}")

    val nickname: String? = "  learner  "
    val cleanName = nickname?.trim()?.takeIf { it.isNotEmpty() } ?: "Guest"
    println("Welcome, $cleanName")

    val text = "42x"
    val parsed = text.toIntOrNull()
    println("Parsed: ${parsed ?: "not a valid integer"}")

    // Try it: build a list of names and print only the ones that are not blank.
}
