// Lesson 2: expressions, if/else, when, and loops.
// Run: kotlinc lessons/02_control_flow.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val score = 82
    val grade = when {
        score >= 90 -> "A"
        score >= 80 -> "B"
        score >= 70 -> "C"
        else -> "Keep practicing"
    }
    println("Score $score earns: $grade")

    val studyPlan = listOf("Types", "Conditions", "Functions")
    for ((index, topic) in studyPlan.withIndex()) {
        println("${index + 1}. $topic")
    }

    var countdown = 3
    while (countdown > 0) {
        println("Starting in $countdown")
        countdown--
    }

    // Try it: print only the even numbers from 1 through 20 and count them.
}
