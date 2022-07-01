import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

//write a guessing game
//prompt the reader to guess a #
public class TooLargeTooSmall {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 10 + 1);

        System.out.println("Guess a number from 1 - 10!");

        int guess = ' ';

        while (guess != randomNum) {
            guess = userInput.nextInt();
            if (guess < randomNum) {
                System.out.println("Too small! Try again!");
            } else if (guess > randomNum) {
                System.out.println("Too large! Try again!");
            } else if (guess == randomNum) {
                System.out.println("Woo hoo! Correct guess!");
                break;
            }

        }
    }
}












