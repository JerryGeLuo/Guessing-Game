import java.util.Random;
import java.util.Scanner;

class Main{
    public class Main{
        public static void main(String[] args) {
            Random rand = new Random();
            int x = rand.nextInt(100);

            Scanner scan = new Scanner(System.in);
            int guess;
            int count = 0;

            do {
                System.out.println("Enter your guess: ");
                guess = scan.nextInt();

                if (guess < x) {
                    System.out.println("Too low!");
                } else if (guess > x) {
                    System.out.println("Too high!");
                }

                count++;
            } while (guess != x);

            if (count < 8) {
                System.out.println("You got an impossibly good score!");
            } else if (count < 11) {
                System.out.println("You did a good job!");
            } else {
                System.out.println("Try the divide andonquer strategy next time!");
            }
        }
    }
}
