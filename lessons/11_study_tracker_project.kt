// Lesson 11: a final project that combines variables, functions, lists, and validation.
// Run: kotlinc lessons/11_study_tracker_project.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val tracker = StudyTracker()

    tracker.addTopic("Kotlin variables")
    tracker.addTopic("Functions")
    tracker.addTopic("Collections")
    tracker.markComplete("Functions")

    println(tracker.summary())
    println("Incomplete topics: ${tracker.getIncompleteTopics()}")
    println("Progress: ${tracker.progressPercent()}%")

    // Try it: add a removeTopic function and a way to sort topic names alphabetically.
}

class StudyTracker {
    private val topics = mutableListOf<Topic>()

    fun addTopic(name: String) {
        val clean = name.trim()
        require(clean.isNotEmpty()) { "Topic name cannot be blank" }
        if (topics.none { it.name.equals(clean, ignoreCase = true) }) {
            topics.add(Topic(clean, false))
        }
    }

    fun markComplete(name: String) {
        val index = topics.indexOfFirst { it.name.equals(name.trim(), ignoreCase = true) }
        if (index != -1) {
            topics[index] = topics[index].copy(isComplete = true)
        }
    }

    fun getIncompleteTopics(): List<String> =
        topics.filter { !it.isComplete }.map { it.name }

    fun progressPercent(): Int {
        if (topics.isEmpty()) return 0
        val complete = topics.count { it.isComplete }
        return (complete * 100) / topics.size
    }

    fun summary(): String =
        "Study tracker: ${topics.count { it.isComplete }}/${topics.size} topics done"
}

data class Topic(val name: String, val isComplete: Boolean)
