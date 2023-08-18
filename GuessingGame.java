import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public GuessingGame(){
        System.out.println("Hello, player! What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        Random rand = new Random();
        int number = rand.nextInt(100);
        int attempts = 0;
        System.out.println("I'm thinking of a number between 0 and 99, what is it?");
        while (true) {
            int guess;
            try {
                guess = input.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = input.next();
                System.out.println("Who responds with a decimal number for a game like this? Integers only, please...");
                continue;
            }
            attempts += 1;
            if (guess < 0 || guess > 99) {
                System.out.println(guess + " is not between 0 and 99! And this still counts as a guess!");
                continue;
            }
            if (guess < number) {
                System.out.println("Not enough!");
            } else if (guess > number) {
                System.out.println("Too much!");
            } else {
                System.out.println("Well played, " + name);
                System.out.println("It only took you " + attempts + " attempts.");
                break;
            }
        }
    }
}
