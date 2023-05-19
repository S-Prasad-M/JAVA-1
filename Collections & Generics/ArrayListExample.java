import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        // Add elements to the ArrayList
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(25);

        // Print the elements of the ArrayList
        System.out.println("ArrayList: " + arrayList);

        // Find and print the size of the ArrayList
        int size = arrayList.size();
        System.out.println("Size of ArrayList: " + size);

        // Access and print the element at index 2
        int elementAtIndex2 = arrayList.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Check if the ArrayList contains the element 15 and print the result
        boolean contains15 = arrayList.contains(15);
        System.out.println("ArrayList contains 15: " + contains15);

        // Insert the element 30 at index 1 in the ArrayList
        arrayList.add(1, 30);
        System.out.println("ArrayList after adding 30: " + arrayList);

        // Remove the element 10 from the ArrayList
        // boolean removed = arrayList.remove(Integer.valueOf(10));
        arrayList.remove(Integer.valueOf(10));
        System.out.println("ArrayList after removing 10: " + arrayList);

        // Iterate over the elements of the ArrayList and print each element
        System.out.print("Elements in ArrayList: ");
        for (int element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear the ArrayList and print the empty ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}