import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        System.out.println("Guess a number between 1 and 100:");

        while (true) {
            userGuess = scanner.nextInt();
            if (userGuess == numberToGuess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again:");
            } else {
                System.out.println("Too high! Try again:");
            }
        }

        scanner.close();
    }
}