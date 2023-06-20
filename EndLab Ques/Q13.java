class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new InvalidInputException("InvalidInputException: Please provide exactly two integers as command line arguments.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num1 <= 0 || num2 <= 0) {
                throw new InvalidInputException("InvalidInputException: Both numbers should be positive integers.");
            }

            if (num2 <= num1) {
                throw new InvalidInputException("InvalidInputException: The second number should be larger than the first number.");
            }

            System.out.println("Prime numbers between " + num1 + " and " + num2 + ":");

            for (int i = num1; i <= num2; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("InvalidInputException: Please provide valid integers as command line arguments.");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
