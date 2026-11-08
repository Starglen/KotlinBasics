// Lesson 7: generics and higher-order functions.
// Run: kotlinc lessons/07_generics_and_lambdas.kt -include-runtime -d lesson.jar && java -jar lesson.jar
fun main() {
    val ints = listOf(1, 2, 3, 4)
    val strings = listOf("alpha", "beta")

    println("Sum: ${sumList(ints)}")
    println("Item count: ${countGreaterThan(strings, "a")}")

    val total = ints.fold(0) { acc, value -> acc + value }
    println("Fold total: $total")

    val names = listOf("Ada", "Grace", "Linus")
    val sorted = names.sortedBy { it.length }
    println("Sorted by length: $sorted")
}

fun sumList(numbers: List<Int>): Int = numbers.sum()

fun countGreaterThan(items: List<String>, minLength: String): Int =
    items.count { it.length > minLength.length }
