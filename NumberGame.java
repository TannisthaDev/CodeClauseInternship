import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int maxAttempts = 10;
        int score = 0;
        boolean playAgain = true;
        
        System.out.println("Welcome to the Guess the Number game!");
        
        while (playAgain) {
            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int attempts = 0;
            
            System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound);
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess (" + (maxAttempts - attempts) + " attempts left): ");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess < lowerBound || userGuess > upperBound) {
                    System.out.println("Please enter a number within the valid range.");
                } else if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts;
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Try higher!");
                } else {
                    System.out.println("Try lower!");
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've run out of attempts. The number was " + numberToGuess);
            }
            
            System.out.print("Your current score: " + score + "\nPlay again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }
        
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}