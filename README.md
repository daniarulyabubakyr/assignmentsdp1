# StudyMateApp

## Product

StudyMateApp is a study application designed for students.

The application can be built in two different representations:

- Free version
- Premium version

The Builder Pattern is used because the application contains several configurable parts such as language, theme, authentication, notifications, study planner, and subscription.

## Project Structure

```text
assignmentsdp1/
├── src/
│   ├── studymate/
│   │   ├── StudyMateApp.java
│   │   ├── StudyMateBuilder.java
│   │   ├── AbstractStudyMateBuilder.java
│   │   ├── FreeStudyMateBuilder.java
│   │   ├── PremiumStudyMateBuilder.java
│   │   └── StudyMateDirector.java
│   └── Main.java
└── README.md
```

## Builder Pattern Components

- **StudyMateApp** — Product
- **StudyMateBuilder** — Builder interface
- **AbstractStudyMateBuilder** — common builder implementation
- **FreeStudyMateBuilder** — Concrete Builder for the Free version
- **PremiumStudyMateBuilder** — Concrete Builder for the Premium version
- **StudyMateDirector** — controls the construction steps
- **Main** — Client that demonstrates the application

## How to Build Free Version

The Free version is created using `FreeStudyMateBuilder` and `StudyMateDirector`.

The configuration includes:

- English language
- Light theme
- Email authentication
- Basic notifications
- Basic study planner
- Free subscription

## How to Build Premium Version

The Premium version is created using `PremiumStudyMateBuilder` and `StudyMateDirector`.

The configuration includes:

- Kazakh + Russian + English
- Soft Blue theme
- Apple ID + Email authentication
- Smart notifications
- Advanced study planner
- Premium subscription

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java is configured.
3. Open `Main.java`.
4. Run the `main()` method.
5. The console will display both Free and Premium versions.

## Java Version

The project is implemented in Java.
