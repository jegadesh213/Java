import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("WELCOME TO THE CPU READER GAME");
        int randomnumber = ThreadLocalRandom.current().nextInt(1 , 6 );
        System.out.println("The cpu has Guessed a number between (1-6)!!Try to find it and win the Game");

        System.out.print("Enter the number u guess:");
        int user1 = scanner.nextInt();

        if (user1 == randomnumber){
            System.out.println("Excellent u have found the number!!");
        }
        else if (user1 != randomnumber){
            System.out.println("Nakku sethapayale!!");
            System.out.println("Innoru time try pannu la");
            System.out.println("Enter ur number for second chance la");
        }
        int user2 = scanner.nextInt();

        if(user2 != randomnumber){
            System.out.println("poison kudichi Saavu la!");
        }
        else if (user2 == randomnumber){
            System.out.println("congratulations! u won!");
        }
    }
}
