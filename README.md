# SudoCool

SudoCool is a Sudoku app powered by Kotlin Multiplatform for Android and iOS with a shared backend
service built in Ktor.
The project features a modular solver and hint engine and level generation with multiple
difficulties.

---

## Features

- **Quality of Life:** Made with a focus on quality of life features for the best Sudoku experience.
- **Highly Customizable:** Includes many settings to make the app truly feel like your own.
- **Custom Board Generator:** On demand generation of unique Sudoku levels.
- **Intelligent Hint Engine:** Helpful hints that adapt to your needs, ranging from a gentle nudge
  toward your next move to an in-depth breakdown of the underlying strategy behind a move.

---

## Repository Structure

```text
├── app/
│   ├── androidApp/     # Android application launcher & configuration
│   ├── iosApp/         # Xcode project wrapper for iOS launch & SwiftUI integration
│   └── shared/         # Shared Compose Multiplatform UI & presentation logic
├── core/               # Shared data models
│   └── src/commonMain/ # Sudoku algorithms for board generation and solver logic shared by client and server
└── server/             # Ktor backend application
```

---

## Tech Stack

| Layer           | Technologies                                                    |
|-----------------|-----------------------------------------------------------------|
| **Shared Core** | Kotlin Multiplatform, Kotlinx Coroutines, Kotlinx Serialization |
| **Mobile UI**   | Compose Multiplatform, Jetpack Compose, SwiftUI bridge          |
| **Backend**     | Ktor Server                                                     |
| **Tooling**     | Gradle (Kotlin DSL), Android Studio, Xcode                      |

---

## Getting Started

### Running the Apps

- **Ktor Server:**
  ```bash
  ./gradlew :server:run
  ```
  *Default server endpoint runs on `http://localhost:8080`.*

- **Android App:**
  ```bash
  ./gradlew :app:androidApp:installDebug
  ```
  *Or run directly from Android Studio selecting the `androidApp` run configuration.*

- **iOS App:**
  Open `app/iosApp` in Xcode and select your target simulator or device, or run via Android Studio
  with Xcode integration enabled.

---

## Testing

Run unit and integration tests across targets:

- **Core:**
  ```bash
  ./gradlew :core:allTests
  ```
- **Client:**
  ```bash
  ./gradlew :app:shared:allTests
  ```
- **Server:**
  ```bash
  ./gradlew :server:test
  ```

---

## Architecture Note: Solver & Generator

All board generation, backtracking solvers, and hint logic live inside `:core:src:commonMain`. This
allows:

1. **Offline play on mobile:** Devices can generate and solve boards locally without requiring a
   network connection.
2. **Server-side performance:** The Ktor server reuses the identical codebase for faster level and
   hint generation.

## Contributors

- **Nina Zimmermann** – [LinkedIn](https://www.linkedin.com/in/nina-zimmermann-082a6b254/) • [GitHub](https://github.com/chambrehomme)
- **Jeremy van der Schans** – [LinkedIn](https://www.linkedin.com/in/jeremy-van-der-schans-395107249/) • [GitHub](https://github.com/vandeje1)