import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        System.out.println("****GUESS GAME****");

        System.out.println("----RULES----");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"HIGHER\" if my guess is too low.");
        System.out.println("Enter \"LOWER\" if my guess is too high.");
        System.out.println("Enter \"CORRECT\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 10;
        int guess = 5;

        while (true) {

            int randomNumber = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.print("GUESS " + randomNumber + ".");
            System.out.print("\nYOUR RESPONSE:");
            input = scanner.next();

            if (input.equals("HIGHER")) {
                min = randomNumber + 1;
            } else if (input.equals("LOWER")) {
                max = randomNumber - 1;
            } else if (input.equals("CORRECT")) {
                System.out.println("\n" + randomNumber + ", eh? I knew I'd get it eventually.");
                break;
            }
            guess = (min + max) / 2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 10;
                guess = 5;
            }

        }
    }
}