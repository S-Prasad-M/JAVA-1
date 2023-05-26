import java.io.FileReader;
import java.io.IOException;

public class AverageNumber {
    public static void main(String[] args) {
        String filePath = "file.txt";
        try (FileReader fr = new FileReader(filePath)) 
        {
            int character;
            int sum = 0;
            int count = 0;
            int number = 0;
            boolean isNumber = false;
            while ((character = fr.read()) != -1) 
            {
                if (Character.isDigit((char) character)) {
                    number = number * 10 + Character.getNumericValue((char) character);
                    isNumber = true;
                } 
                else {
                    if (isNumber) {
                        sum += number;
                        count++;
                        number = 0;
                        isNumber = false;
                    }
                }
            }
            if (isNumber) {
                sum += number;
                count++;
            }
            double average = (double) sum / count;

            System.out.println("Average: " + average);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
