import java.util.*;

public class StringLen {
    public static void main(String[] args) {
        String[] strings = { "apple", "banana", "grape", "orange", "pear", "kiwi", "mango" };

        // Group the strings by their lengths
        Map<Integer, List<String>> lengthMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            if (lengthMap.containsKey(length)) {
                lengthMap.get(length).add(str);
            } else {
                List<String> stringList = new ArrayList<>();
                stringList.add(str);
                lengthMap.put(length, stringList);
            }
        }

        // Display the grouped strings
        for (Map.Entry<Integer, List<String>> entry : lengthMap.entrySet()) {
            System.out.println("Strings of length " + entry.getKey() + ": " + entry.getValue());
        }
    }
}