# Kotlin cheat sheet

## Variables

```kotlin
val name = "Ada"          // immutable
var score = 10             // mutable
var age: Int = 21
```

## Functions

```kotlin
fun greet(name: String): String {
    return "Hello, $name"
}

fun add(a: Int, b: Int) = a + b
```

## Conditionals

```kotlin
val grade = if (score >= 80) "A" else "B"

when (day) {
    1 -> println("Monday")
    2 -> println("Tuesday")
    else -> println("Another day")
}
```

## Loops

```kotlin
for (i in 1..5) {
    println(i)
}

while (count > 0) {
    count--
}
```

## Collections

```kotlin
val list = listOf(1, 2, 3)
val mapped = list.map { it * 2 }
val filtered = list.filter { it > 1 }
```

## Null safety

```kotlin
val name: String? = null
println(name?.length ?: 0)
```

## Classes

```kotlin
data class Student(val name: String, val age: Int)

class Course(val title: String) {
    fun info() = "Course: $title"
}
```

## Basics to remember

- `val` is read-only
- `var` is mutable
- `if` and `when` are expressions in Kotlin
- `null` must be handled explicitly
- collections are functional-friendly
- classes can hold state and behavior
- functions can be reused in many contexts
