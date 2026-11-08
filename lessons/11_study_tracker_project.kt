// Lesson 11: final project — study tracker.
// Run: kotlinc lessons/11_study_tracker_project.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val tracker = StudyTracker()
    tracker.addTopic("Variables")
    tracker.addTopic("Functions")
    tracker.addTopic("Collections")
    tracker.markComplete("Functions")

    println(tracker.summary())
    println("Incomplete: ${tracker.incompleteTopics()}")
    println("Progress: ${tracker.progressPercent()}%")
}

class StudyTracker {
    private val topics = mutableListOf<Topic>()

    fun addTopic(name: String) {
        val clean = name.trim()
        require(clean.isNotEmpty()) { "Topic cannot be blank" }
        if (topics.none { it.name.equals(clean, ignoreCase = true) }) {
            topics.add(Topic(clean, false))
        }
    }

    fun markComplete(name: String) {
        val idx = topics.indexOfFirst { it.name.equals(name.trim(), ignoreCase = true) }
        if (idx != -1) {
            topics[idx] = topics[idx].copy(isComplete = true)
        }
    }

    fun incompleteTopics(): List<String> = topics.filter { !it.isComplete }.map { it.name }

    fun progressPercent(): Int {
        if (topics.isEmpty()) return 0
        val complete = topics.count { it.isComplete }
        return (complete * 100) / topics.size
    }

    fun summary(): String = "Progress: ${topics.count { it.isComplete }}/${topics.size} topics complete"
}

data class Topic(val name: String, val isComplete: Boolean)
