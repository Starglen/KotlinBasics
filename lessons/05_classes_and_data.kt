// Lesson 5: data classes and encapsulating behavior in a class.
// Run: kotlinc lessons/05_classes_and_data.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val tracker = StudyTracker("Kotlin basics")
    tracker.addLesson("Variables")
    tracker.addLesson("Functions")
    tracker.completeLesson("Variables")

    println(tracker.summary())
    println("Lessons: ${tracker.lessons}")

    // Try it: add a removeLesson function and ensure removing a missing lesson is safe.
}

data class Lesson(val title: String, val isComplete: Boolean = false)

class StudyTracker(private val courseName: String) {
    private val lessonList = mutableListOf<Lesson>()
    val lessons: List<Lesson>
        get() = lessonList.toList() // expose a read-only snapshot

    fun addLesson(title: String) {
        val cleanTitle = title.trim()
        require(cleanTitle.isNotEmpty()) { "Lesson title cannot be blank" }
        if (lessonList.none { it.title.equals(cleanTitle, ignoreCase = true) }) {
            lessonList.add(Lesson(cleanTitle))
        }
    }

    fun completeLesson(title: String): Boolean {
        val index = lessonList.indexOfFirst { it.title.equals(title.trim(), ignoreCase = true) }
        if (index == -1) return false
        lessonList[index] = lessonList[index].copy(isComplete = true)
        return true
    }

    fun summary(): String {
        val complete = lessonList.count { it.isComplete }
        return "$courseName: $complete/${lessonList.size} lessons complete"
    }
}
