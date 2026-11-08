// Lesson 2: control flow, conditions, ranges, and loops.
// Run: kotlinc lessons/02_control_flow.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val score = 82

    val grade = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else {
        "Needs work"
    }

    println("Grade: $grade")

    for (i in 1..5) {
        println("Loop $i")
    }

    val days = listOf("Mon", "Tue", "Wed")
    for (day in days) {
        println(day)
    }

    // Try it: use `when` instead of `if` and print the grade category.
}
