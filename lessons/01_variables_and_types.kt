// Lesson 1: values, variables, types, and string templates.
// Run: kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val learnerName: String = "Sam" // val cannot be reassigned
    var completedLessons: Int = 1 // var can be reassigned
    completedLessons += 1

    val hoursStudied = 1.5 // Kotlin infers Double
    val isReadyForNextLesson = completedLessons >= 2

    println("Learner: $learnerName")
    println("Lessons completed: $completedLessons")
    println("Hours studied: $hoursStudied")
    println("Ready for next lesson: $isReadyForNextLesson")

    // Try it: change the values, add a Boolean variable, and print a sentence using it.
}
