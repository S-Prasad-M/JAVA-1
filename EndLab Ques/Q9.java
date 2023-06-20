import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];

        // Generate random values between 10 and 90 and calculate sum
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(81) + 10;
            sum += array[i];
        }

        // Calculate average
        double average = (double) sum / array.length;

        // Separate values below average and above average into ArrayLists
        List<Integer> belowAverageList = new ArrayList<>();
        List<Integer> aboveAverageList = new ArrayList<>();

        for (int value : array) {
            if (value < average) {
                belowAverageList.add(value);
            } else {
                aboveAverageList.add(value);
            }
        }

        // Print below average values
        System.out.print("Below Average: ");
        for (int value : belowAverageList) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Print above average values
        System.out.print("Above Average: ");
        for (int value : aboveAverageList) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
