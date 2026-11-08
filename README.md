# Kotlin Foundations

This repo is built as a practical learning resource for Kotlin beginners and early intermediate learners. It focuses on core Kotlin features and on using code examples that are easy to run and easy to reason about.

## Why this repo exists

Many beginner repos are just a few random scripts. This repo is meant to teach the language as a whole:

- syntax and structure
- functions and data flow
- collections and abstractions
- safety and validation
- objects and reuse
- async patterns
- testing fundamentals

## Course flow

1. Variables and types
2. Control flow
3. Functions and defaults
4. Collections and null safety
5. Classes and data classes
6. Interfaces and inheritance
7. Generics and lambdas
8. Exceptions and validation
9. Coroutines basics
10. Testing patterns
11. Final project: study tracker

## Run a lesson

Compile and run a single lesson file at a time:

```bash
kotlinc lessons/01_variables_and_types.kt -include-runtime -d lesson.jar
java -jar lesson.jar
```

Use the same pattern for any lesson file. Do not compile every file at once unless each file is meant to be independent and you understand the result.

## Files in this repo

- `lessons/` — individual, runnable Kotlin lessons
- `README.md` — overview and learning path
- `lessons/12_kotlin_cheat_sheet.md` — compact reference notes

## Learning method

- Read the comments.
- Run the example exactly as written.
- Change one value and predict the output.
- Add your own mini challenge.
- Repeat with different inputs.

## Final project

The last lesson is a small study tracker app that can do the following:

- add study topics
- mark them complete
- list incomplete work
- calculate the progress percent
- reject bad input like an empty topic name

This gives you a realistic project that combines most of the major Kotlin ideas in one place.

## Useful references

- Kotlin docs: https://kotlinlang.org/docs/home.html
- Kotlin basics: https://kotlinlang.org/docs/basic-syntax.html
- Null safety: https://kotlinlang.org/docs/null-safety.html
- Coroutines: https://kotlinlang.org/docs/coroutines-guide.html
- Collections: https://kotlinlang.org/docs/collections-overview.html

## Practical note

This is a strong beginner-to-intermediate learning repo. It gives you a solid Kotlin foundation and demonstrates the kind of code patterns used in real projects, without pretending to be a complete description of every Kotlin edge case.
