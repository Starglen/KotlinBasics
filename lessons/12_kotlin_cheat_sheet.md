# Kotlin cheat sheet

## Variables and constants

```kotlin
val name = "Ada"
var score = 10
var age: Int = 21
```

## Conditionals

```kotlin
val grade = if (score >= 80) "A" else "B"

when (value) {
    1 -> println("One")
    2 -> println("Two")
    else -> println("Other")
}
```

## Functions

```kotlin
fun greet(name: String): String = "Hello, $name"
fun sum(a: Int, b: Int) = a + b
```

## Collections

```kotlin
val numbers = listOf(1, 2, 3)
val doubled = numbers.map { it * 2 }
val evens = numbers.filter { it % 2 == 0 }
```

## Null safety

```kotlin
val nickname: String? = null
println(nickname?.length ?: 0)
```

## Classes

```kotlin
data class Student(val name: String, val age: Int)

class Course(val title: String) {
    fun info() = "Course: $title"
}
```

## Exceptions

```kotlin
require(age >= 0) { "Age cannot be negative" }
```

## Coroutines

```kotlin
import kotlinx.coroutines.*

fun main() = runBlocking {
    launch { println("Working") }
}
```
