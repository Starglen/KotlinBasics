// Lesson 9: coroutine basics.
// Run: kotlinc lessons/09_coroutines_basics.kt -include-runtime -d lesson.jar && java -jar lesson.jar
// This is a conceptual reference for a project using kotlinx-coroutines.
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start")
    val first = async { fetchTopic("Variables") }
    val second = async { fetchTopic("Coroutines") }

    println(first.await())
    println(second.await())
    println("Done")
}

suspend fun fetchTopic(topic: String): String {
    delay(200)
    return "Lesson ready: $topic"
}
