// Lesson 3: reusable functions, parameters, defaults, and return values.
// Run: kotlinc lessons/03_functions.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val topics = listOf("Variables", "Functions", "Collections")
    println(formatProgress("Alex", completed = 2, total = topics.size))
    println("Estimated study time: ${estimateMinutes(topics.size)} minutes")

    // Invalid values are handled explicitly rather than producing a misleading result.
    println("Completion: ${completionPercent(completed = 2, total = 3)}%")
    println("Invalid total: ${completionPercent(completed = 1, total = 0)}")

    // Try it: write a function that returns the longest word in a non-empty list.
}

fun formatProgress(name: String, completed: Int, total: Int): String =
    "$name completed $completed of $total lessons"

fun estimateMinutes(numberOfTopics: Int, minutesPerTopic: Int = 20): Int =
    numberOfTopics * minutesPerTopic

fun completionPercent(completed: Int, total: Int): Int? {
    if (total <= 0 || completed !in 0..total) return null
    return completed * 100 / total
}
