# Kotlin Basics

A hands-on Kotlin course for beginners. Each lesson is a small, standalone program with comments, sample output, and a challenge. You can run lessons independently without needing a build system.

## Requirements

Install the Kotlin command-line compiler (`kotlinc`) and a Java runtime, or open a lesson in IntelliJ IDEA. Check your installation with `kotlinc -version`.

## Run a lesson

From the repository root, compile and run one lesson at a time:

```bash
kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar
java -jar lesson.jar
```

Change the lesson filename to run another example. The files are deliberately independent: each has its own `main()` entry point.

## Course map

1. [`01_variables_and_types.kt`](lessons/01_variables_and_types.kt) — `val`, `var`, types, and string templates
2. [`02_control_flow.kt`](lessons/02_control_flow.kt) — conditions, ranges, and loops
3. [`03_functions.kt`](lessons/03_functions.kt) — parameters, return values, defaults, and validation
4. [`04_collections_and_null_safety.kt`](lessons/04_collections_and_null_safety.kt) — lists, filtering, nullable values, and safe calls
5. [`05_classes_and_data.kt`](lessons/05_classes_and_data.kt) — data classes, state, and simple object behavior

Read the comments, run the program, change one thing, and predict the result before running it again.

## Practice routine

For each lesson:

1. Run the example unchanged.
2. Explain each line in your own words.
3. Complete the `Try it` challenge in the file.
4. Test normal input and edge cases.
5. Save your solution in a separate file so the reference remains available.

## Mini-project: study tracker

After the lessons, build a command-line study tracker that stores topics in a list, marks a topic complete, reports completion percentage, and rejects blank topic names. Use a data class for each topic and functions for the operations.

## Reliable references

- [Kotlin getting started](https://kotlinlang.org/docs/getting-started.html)
- [Kotlin basic syntax](https://kotlinlang.org/docs/basic-syntax.html)
- [Kotlin collections overview](https://kotlinlang.org/docs/collections-overview.html)
- [Kotlin null safety](https://kotlinlang.org/docs/null-safety.html)

## Contributing

Keep examples beginner-friendly and executable with the documented command. Explain expected behavior, include a small practice task, and avoid adding dependencies unless a lesson specifically teaches them.
