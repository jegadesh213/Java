import java.util.Scanner;

public class Greatest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First value:");
        int x = scanner.nextInt();

        System.out.print("Enter the Second value:");
        int y = scanner.nextInt();

        if(x > y) {
            System.out.println("The First value " + x +" is greater" );
            System.out.println("And having the difference of " + (x-y) );
        }
        else if(y > x) {
            System.out.println("The Second value " + y + " is greater");
            System.out.println("And having the difference of " + (y-x) );
        }
        else  {
            System.out.println("The values "+ x + "," + y + " are equal");
            System.out.println(" And no difference between them " + x + " & " + y);
        }
    }
}
