// Lesson 9: coroutine basics and asynchronous patterns.
// Run: kotlinc lessons/09_coroutines_basics.kt -include-runtime -d lesson.jar && java -jar lesson.jar
// Note: this example is conceptual and meant to be used in a project with coroutine dependencies.
// In a basic JVM setup, it is useful as a reference for how coroutine code is structured.
import kotlinx.coroutines.*

fun main() = runBlocking {
    println("Start")
    val task1 = async { fetchLesson("Variables") }
    val task2 = async { fetchLesson("Coroutines") }

    println(task1.await())
    println(task2.await())
    println("Finish")
}

suspend fun fetchLesson(topic: String): String {
    delay(200)
    return "Finished lesson: $topic"
}
