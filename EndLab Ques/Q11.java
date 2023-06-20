import java.util.InputMismatchException;
import java.util.Scanner;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part a: User-defined exception for input "hello"
        try {
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (word.equalsIgnoreCase("hello")) {
                throw new CustomException("Custom Exception: 'hello' is not allowed.");
            }

            System.out.println("Input: " + word);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }

        // Part b: Addition of two integers with exception handling for non-numeric input
        try {
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("Exception: Invalid input. Only numeric values are allowed.");
        }
    }
}
