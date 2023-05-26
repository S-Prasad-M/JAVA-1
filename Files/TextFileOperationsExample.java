import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileOperationsExample {
    public static void main(String[] args) {
        String fileName = "Example.txt";

        // Write content to the file
        writeToFile(fileName, "Hello, World!");

        // Append content to the file
        appendToFile(fileName, " This is additional text.");

        // Read and display the content of the file
        readAndDisplayFile(fileName);
    }

    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Content written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void appendToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(content);
            System.out.println("Content appended to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readAndDisplayFile(String fileName) {
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}