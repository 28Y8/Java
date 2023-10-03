import java.util.InputMismatchException;
import java.util.Scanner;

public class TableOfMultiplications {
    public static void main(String[] args) {
        int timesToMultiply = 10;

        // Create scanner and start the scanning process
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to create a multiplication table: ");
        
        // Create variable to multiply
        int toMultiply;
        
        // Catch errors if the user input is incorrect
        try {
            toMultiply = scan.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("The input is not a number, make sure to try again!");
            return;
        }

        // This creates the table easily using our input
        for (int i = 0; i <= timesToMultiply; i++) {
            System.out.println(toMultiply + " * " + i + " = " + toMultiply * i);
        }
    }
}
