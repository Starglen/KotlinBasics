// Lesson 6: generics, higher-order functions, and lambdas.
// Run: kotlinc lessons/06_generics_and_lambdas.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val doubled = numbers.map { it * 2 }
    println("Original: $numbers")
    println("Doubled: $doubled")

    val evens = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evens")

    val maxValue = numbers.maxOrNull()
    println("Largest number: $maxValue")

    val genericBox = Box("Kotlin")
    println("Box contains: ${genericBox.item}")

    // Try it: write a lambda that counts values greater than 3.
}

class Box<T>(val item: T)
