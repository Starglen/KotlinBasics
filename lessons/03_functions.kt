// Lesson 3: functions, parameters, default values, and return values.
// Run: kotlinc lessons/03_functions.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val students = listOf("Nia", "Sam", "Zuri")
    println(greet("Kotlin learner"))
    println(sum(10, 5))
    println(formatStudent("Ada", 21))
    println(getScoreSummary(students))

    // Try it: write a function that returns the longest student name.
}

fun greet(name: String): String = "Hello, $name!"

fun sum(a: Int, b: Int): Int = a + b

fun formatStudent(name: String, age: Int): String = "$name is $age years old"

fun getScoreSummary(students: List<String>, points: Int = 100): String {
    return "${students.size} students prepared for $points points"
}
