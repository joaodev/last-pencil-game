# Last Pencil Game

A simple command-line implementation of the "Last Pencil" game, a variant of the Nim game, written in Java.

## Description

In this game, players take turns removing 1, 2, or 3 pencils from a pile. The player who takes the last pencil loses. You play against an AI bot named Jack, who uses an optimal strategy.

## Rules

- The game starts with a number of pencils (specified by the user).
- Players alternate turns.
- On each turn, a player can remove 1, 2, or 3 pencils.
- The player who removes the last pencil loses.

## How to Run

### Prerequisites

- Java 25 or higher
- Maven

### Building and Running

1. Clone or download the project.
2. Navigate to the project directory.
3. Compile the project:
   ```
   mvn compile
   ```
4. Run the game:
   ```
   mvn exec:java -Dexec.mainClass="br.com.joaodev.game.Main"
   ```

Follow the on-screen prompts to enter the initial number of pencils and choose who goes first.

## Project Structure

- `Main.java`: Entry point of the application.
- `Game.java`: Handles the game logic and flow.
- `Bot.java`: Implements the AI bot's move selection.
- `InputPlayer.java`: Handles user input.
- `OutputPlayer.java`: Handles game output.
- `Validation.java`: Input validation utilities.

## License

This project is open-source. Feel free to use and modify.
