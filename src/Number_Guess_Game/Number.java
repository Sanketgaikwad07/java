package Number_Guess_Game;// File: Game.java

import java.util.Random;
import java.util.Scanner;

 class Game {

    // --- Fields (Game Data) ---
    private int secretNumber;
    private int guessLimit;
    private int guessesTaken;
    private boolean hasGuessedCorrectly;

    private boolean hintGiven = false;

    public Game(int limit) {
        Random random = new Random();
        this.secretNumber = random.nextInt(10) + 1;
        this.guessLimit = limit;
        this.guessesTaken = 0;
        this.hasGuessedCorrectly = false;
        System.out.println("A new game has started! You have " + limit + " guesses.");
        System.out.println("I'm thinking of a number between 1 and 100.");
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (guessesTaken < guessLimit && !hasGuessedCorrectly) {
            System.out.print("Enter your guess Number: ");
            int userGuess = scanner.nextInt();
            guessesTaken++;

            checkGuess(userGuess);

            if (guessesTaken == 4 && !hasGuessedCorrectly && !hintGiven) {
                giveHint();
                hintGiven = true;
            }

        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've run out of guesses. The number was: " + secretNumber);
        }


    }

    private void checkGuess(int guess) {
        if (guess < secretNumber) {
            System.out.println("Too low! Guesses left: " + (guessLimit - guessesTaken));
        } else if (guess > secretNumber) {
            System.out.println("Too high! Guesses left: " + (guessLimit - guessesTaken));
        } else {
            hasGuessedCorrectly = true;
            System.out.println("🎉 Congratulations! You guessed the number in " + guessesTaken + " tries!");
        }
    }


    private void giveHint() {
        System.out.println("--- You seem stuck! Here's a hint. ---");
        Random hintRandom = new Random();
        int hintType = hintRandom.nextInt(5); // 0 or 1

        if (hintType == 0) {
            // Hint 1: Even or Odd
            if (secretNumber % 2 == 0) {
                System.out.println("Hint: The secret number is EVEN.");
            } else {
                System.out.println("Hint: The secret number is ODD.");
            }
        } else {
            // Hint 2: Multiple of...
            if (secretNumber % 3 == 0) {
                System.out.println("Hint: The number is a multiple of 3.");
            } else if (secretNumber % 5 == 0) {
                System.out.println("Hint: The number is a multiple of 5.");
            } else if (secretNumber % 7 == 0) {
                System.out.println("Hint: The number is a multiple of 7.");
            } else {
                System.out.println("Hint: The number isn't a simple multiple of 3, 5, or 7.");
            }
        }
        System.out.println("---------------------------------------");
    }

}