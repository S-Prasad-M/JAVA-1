import java.io.FileReader;
import java.io.IOException;

public class WordCountExample {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "file.txt";
        try (FileReader fr = new FileReader(filePath)) {
            int character;
            int wordCount = 0;
            boolean isWord = false;
            // Read each character of the file
            while ((character = fr.read()) != -1) {
                // Check if the character is a word character (letter or digit)
                if (Character.isLetterOrDigit((char) character)) {
                    isWord = true;
                } 
                else {
                    // If the character is not a word character, increment the word count
                    if (isWord) {
                        wordCount++;
                        isWord = false;
                    }
                }
            }
            // Check if the last character was part of a word
            if (isWord) {
                wordCount++;
            }

            System.out.println("Total number of words: " + wordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
