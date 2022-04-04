import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("****WELCOME TO THE QUIZ****");

        String[] question = new String [] {
            "The moon is further away from the earth than the sun is",
                    "Goldfish only have a three second memory",
                    "Microwaves have a longer wavelength than ultraviolet",
                    "Antibiotics are used to treat viral infections",
                    "Octopuses have three hearts"
        };

        boolean[] answer = new boolean[] {
                false,
                false,
                true,
                false,
                true
        };

        boolean[] userans = new boolean[5];

        int finalscore = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5 ; i++){
            System.out.print("\nQuestion " + (i+1) + " : " + question[i]);
            System.out.print("\nyour answer:");
            userans[i] = scanner.nextBoolean();

            if (userans[i] == answer[i]){
                System.out.println("your answer is correct!");
                finalscore++;
            }
            else {
                System.out.println("Wrong answer");
                System.out.println("The crct answer is "+ answer[i]);
            }

            System.out.println("\nYour final score is " + finalscore+ " out of 5.");

        }

    }
}
