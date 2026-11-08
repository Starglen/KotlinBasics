// Lesson 4: collection operations and Kotlin's nullable types.
// Run: kotlinc lessons/04_collections_and_null_safety.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val scores = listOf(72, 95, 48, 81)
    val passingScores = scores.filter { it >= 60 }.sorted()
    println("Passing scores: $passingScores")
    println("Average score: ${scores.average()}")

    // A nullable String may be absent. Safe calls avoid dereferencing null.
    val optionalNickname: String? = readNickname()
    val displayName = optionalNickname?.trim()?.takeIf { it.isNotEmpty() } ?: "Guest"
    println("Welcome, $displayName")

    // Convert untrusted text safely; toIntOrNull returns null if it is not a number.
    val input = "42x"
    val parsedNumber = input.toIntOrNull()
    println("Parsed number: ${parsedNumber ?: "input was not an integer"}")

    // Try it: given a list of names, print non-blank names in alphabetical order.
}

fun readNickname(): String? = "  learner  "
