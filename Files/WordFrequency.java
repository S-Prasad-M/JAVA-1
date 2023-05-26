import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String filePath = "file.txt";

        try (FileReader fr = new FileReader(filePath)) {
            int character;
            String currentWord = "";
            Map<String, Integer> wordFrequency = new HashMap<>();
            while ((character = fr.read()) != -1) {
                // Check if the character is a whitespace or a word character (letter or digit)
                if (Character.isWhitespace((char) character) || Character.isLetterOrDigit((char) character)) {
                    currentWord += (char) character;
                } 
                else {
                    // If the character is not a whitespace or a word character, process the current word
                    if (!currentWord.isEmpty()) {
                        wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
                        currentWord = "";
                    }
                }
            }
            if (!currentWord.isEmpty()) {
                wordFrequency.put(currentWord, wordFrequency.getOrDefault(currentWord, 0) + 1);
            }

            // Display the word frequency
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
