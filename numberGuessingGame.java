import java.util.Scanner;

public class numberGuessingGame {

    public static void main(String[] args) {
        playGuessTheNumberGame();
    }

    public static void playGuessTheNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);

        int score = 0;
        int totalAttempts = 0;
        int rounds = 0;
        int playAgain = 1;

        System.out.println("Welcome to the Guess the Number game!");

        while (playAgain == 1) {
            int attempts = 0;
            int numberToGuess = 1 + (int) (100 * Math.random());
            boolean guessed = false;

            System.out.println("Round " + ++rounds);
            System.out.println("A number is chosen between 1 to 100.");
            System.out.println("Guess the number within 10 trials.");

            while (!guessed && attempts < 10) {
                int attemptsLeft = 10 - attempts;
                System.out.println("Attempts left: " + attemptsLeft);

                System.out.print("Guess the number: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    guessed = true;
                } else if (guess < numberToGuess) {
                    System.out.println("The number is greater than " + guess);
                } else {
                    System.out.println("The number is less than " + guess);
                }
            }

            if (guessed) {
                int roundScore = 10 - attempts + 1;
                score += roundScore;
                System.out.println("Round Score: " + roundScore);
            } else {
                System.out.println("You have exhausted all 10 trials. The number was " + numberToGuess);
            }

            totalAttempts += attempts;
            System.out.println("Total Score: " + score);
            System.out.println("Total Attempts: " + totalAttempts);

            System.out.print("Do you want to play again? (1: Yes, 0: No): ");
            playAgain = sc.nextInt();
        }

        System.out.println("Thank you for playing the Guess the Number game!");
    }
}
