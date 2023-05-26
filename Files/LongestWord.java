import java.io.FileReader;
import java.io.IOException;

public class LongestWord{
    public static void main(String[] args) 
    {
        String filePath = "file.txt";

        try (FileReader fr = new FileReader(filePath)) 
        {
            int character;
            String longestWord = "";
            String currentWord = "";
            while ((character = fr.read()) != -1) {
                if (Character.isLetterOrDigit((char) character)) {
                    currentWord += (char) character;
                } 
                else {
                    if (currentWord.length() > longestWord.length()) {
                        longestWord = currentWord;
                    }
                    currentWord = "";
                }
            }
            if (currentWord.length() > longestWord.length()) {
                longestWord = currentWord;
            }
            System.out.println("Longest word: " + longestWord);
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
