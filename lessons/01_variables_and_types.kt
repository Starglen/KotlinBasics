// Lesson 1: variables, constants, types, and string templates.
// Run: kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val name = "Ada"
    var score = 10
    val age: Int = 21
    val isActive = true

    score += 5

    println("Name: $name")
    println("Score: $score")
    println("Age: $age")
    println("Active: $isActive")

    // Try it: add a `courseName` variable and print a sentence such as:
    // "Ada is learning Kotlin for courseName"
}
