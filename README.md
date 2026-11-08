# Kotlin Foundations

This repo is a real Kotlin learning resource for beginners and early intermediate learners. It is designed to help you understand the language through runnable examples, short exercises, and project-style tasks.

## What this repo covers

- Variables, constants, and scalar types
- Input, output, and string templates
- Conditions, loops, ranges, and `when`
- Functions, return values, and default arguments
- Lists, maps, filtering, mapping, and sorting
- Null safety and safe handling of missing values
- Classes, objects, state, and data classes
- Interfaces, inheritance, and abstraction
- Generic types and higher-order functions
- Exceptions, validation, and defensive coding
- Coroutines and async patterns
- Testing concepts with assertions and small examples
- Final project: a study tracker app with tasks and progress

## Recommended learning order

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
11. `lessons/11_study_tracker_project.kt`
12. `lessons/12_kotlin_cheat_sheet.md`

## Run a lesson

Compile one file at a time:

```bash
kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar
java -jar lesson.jar
```

Use the same pattern for any other lesson file. Do not compile the entire directory at once unless each lesson is intentionally independent and you know what you are doing.

## Learning habit

For every lesson:

1. Read the comments.
2. Run the code.
3. Change one value and predict the outcome.
4. Write your own mini example.
5. Solve the challenge in the comments.

## Final project

The final project in `lessons/11_study_tracker_project.kt` is a study tracker:

- add topics
- mark them complete
- list incomplete work
- calculate progress percentage
- prevent blank names and duplicates

This helps you combine loops, functions, classes, and validation in one practical app.

## References

- Kotlin docs: https://kotlinlang.org/docs/home.html
- Kotlin basics: https://kotlinlang.org/docs/basic-syntax.html
- Collections: https://kotlinlang.org/docs/collections-overview.html
- Null safety: https://kotlinlang.org/docs/null-safety.html
- Coroutines: https://kotlinlang.org/docs/coroutines-guide.html

## Why this repo is valuable

This repo is intentionally structured as a practical learning resource. It is built to guide you from syntax to real Kotlin problem solving, instead of leaving you with isolated code snippets that do not fit together.
