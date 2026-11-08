// Lesson 5: classes, objects, and data classes.
// Run: kotlinc lessons/05_classes_and_data.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val student = Student("Nia", 19)
    println(student)

    val course = Course("Kotlin Basics")
    println(course.info())

    val tracker = StudyProgress()
    tracker.addLesson("Variables")
    tracker.addLesson("Functions")
    tracker.markComplete("Variables")
    println(tracker.summary())
}

data class Student(val name: String, val age: Int)

class Course(val title: String) {
    fun info(): String = "Course: $title"
}

class StudyProgress {
    private val lessons = mutableListOf<String>()
    private val completed = mutableListOf<String>()

    fun addLesson(name: String) {
        if (name.isNotBlank() && name !in lessons) {
            lessons.add(name)
        }
    }

    fun markComplete(name: String) {
        if (name in lessons && name !in completed) {
            completed.add(name)
        }
    }

    fun summary(): String = "Completed ${completed.size} out of ${lessons.size} lessons"
}
