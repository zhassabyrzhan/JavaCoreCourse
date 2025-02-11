import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // The first error is in this block
        System.out.println("***** Welcome to simple program *****");
        System.out.println("*\tThis program contains 3 errors\t*");

        System.out.println("Please enter a natural number between 1 and 5:");
        // The second error is in this block
        Scanner scanner = new Scanner(System.in);

        int naturalNumber = scanner.nextInt();

        if (naturalNumber < 1 || naturalNumber > 5) {
            System.out.println("Your number is not in the specified range!");
        } else if (naturalNumber == 1) {
            System.out.println("Hi, how are you doing?");
        } else if (naturalNumber == 2) {
            // The third error is in this block
            System.out.println("Have a good day!");
        } else if (naturalNumber == 3) {
            System.out.println("You're very good at fixing bugs.");
        } else if (naturalNumber == 4) {
            System.out.println("You will become a good programmer!");
        } else {
            System.out.println("See you soon!");
        }

    }
}
