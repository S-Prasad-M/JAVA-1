
import java.util.LinkedList;

public class BinaryToDecimalLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList to store the binary digits
        LinkedList<Integer> binaryDigits = new LinkedList<>();

        // Add binary digits to the LinkedList (in reverse order)
        binaryDigits.add(1);
        binaryDigits.add(0);
        binaryDigits.add(1);
        binaryDigits.add(0);

        // Calculate the decimal equivalent
        int decimal = convertBinaryToDecimal(binaryDigits);

        // Print the decimal equivalent
        System.out.println("Binary: " + binaryDigits);
        System.out.println("Decimal: " + decimal);
    }

    public static int convertBinaryToDecimal(LinkedList<Integer> binaryDigits) {
        int decimal = 0;
        int power = 0;

        // Iterate over the binary digits (from right to left)
        while (!binaryDigits.isEmpty()) {
            int digit = binaryDigits.removeLast();
            decimal += digit * Math.pow(2, power);
            power++;
        }

        return decimal;
    }
}
