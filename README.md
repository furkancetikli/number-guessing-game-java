# 🎮 Number Guessing Game (Java)

Welcome to the **Number Guessing Game**! This is a dynamic, console-based game built in Java where the computer generates a random number within a user-defined range, and the player tries to guess it with the help of smart directional hints.

---

## ✨ Features

* **Dynamic Range Selection:** The user defines the minimum and maximum boundaries for the game.
* **Input Validation:** Built-in validation checks that ensure the lower bound isn't higher than the upper bound, and alerts the user if their guess falls outside the chosen range.
* **Smart Hints:** Provides real-time feedback (`Yükselt` / `Azalt`) to guide the player toward the correct number.
* **Performance Optimized:** Uses `ThreadLocalRandom` for high-performance and modern pseudo-random number generation.
* **Score Tracking:** Tracks and displays the total number of attempts it took to guess the correct number.

---

## 🚀 How to Run

### Prerequisites
Make sure you have **Java Development Kit (JDK)** installed on your machine.

### Execution Steps
1. Clone or download the repository.
2. Open your terminal/command prompt and navigate to the project folder.
3. Compile the Java file:
   ```bash
   javac Main.java
   ```
4. Run the application:
   ```bash
   java Main
   ```

---

## 🛠️ Technologies Used

* **Language:** Java 
* **Input Management:** `java.util.Scanner`
* **Randomizer:** `java.util.concurrent.ThreadLocalRandom`

---

## 📝 License
This project is open-source and free to use for educational purposes.
