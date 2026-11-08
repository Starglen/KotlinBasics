# Kotlin Foundations

This repo is designed as a broad Kotlin learning path covering the major language features most learners use first. It is intentionally practical: each lesson is focused, runnable, and written to help you understand and apply the concept, not just memorize syntax.

## Coverage

Core topics included in this repo:

- Variables, constants, and types
- Expressions and control flow
- Functions and default arguments
- Collections and transformation functions
- Null safety and nullable values
- Classes, data classes, and inheritance
- Interfaces, abstraction, and polymorphism
- Generics, lambdas, and higher-order functions
- Exceptions and validation
- Basic coroutines and asynchronous workflows
- Testing patterns and simple assertions

## How to run a lesson

Compile and run a lesson file one at a time:

```bash
kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar
java -jar lesson.jar
```

Repeat with a different file name to study each topic independently.

## Lesson map

1. `lessons/01_variables_and_types.kt`
2. `lessons/02_control_flow.kt`
3. `lessons/03_functions.kt`
4. `lessons/04_collections_and_null_safety.kt`
5. `lessons/05_classes_and_data.kt`
6. `lessons/06_generics_and_lambdas.kt`
7. `lessons/07_interfaces_and_inheritance.kt`
8. `lessons/08_exceptions_and_validation.kt`
9. `lessons/09_coroutines_basics.kt`
10. `lessons/10_testable_code.kt`

## Learning method

- Read the comments first.
- Run the code without changing it.
- Change one value and predict the result.
- Add a small challenge from the comment block.
- Repeat with your own examples.

## Practice project ideas

- Study tracker with completion status
- Expense tracker with categories and totals
- Library catalog with search and filtering
- Task manager using lists, functions, classes, and coroutines

## References

- Kotlin docs: https://kotlinlang.org/docs/home.html
- Basic syntax: https://kotlinlang.org/docs/basic-syntax.html
- Null safety: https://kotlinlang.org/docs/null-safety.html
- Coroutines: https://kotlinlang.org/docs/coroutines-guide.html

## Note

This repo focuses on the language foundations most programmers use in real Kotlin projects. It does not try to cover every niche JVM or multiplatform edge case, but it gives you a solid starting point for understanding the language as a whole.
