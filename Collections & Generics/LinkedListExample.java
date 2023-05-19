import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Durian");
        // Print the elements of the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Find and print the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        // Access and print the first element of the LinkedList
        String firstElement = linkedList.get(0);
        System.out.println("First element: " + firstElement);

        // Check if the LinkedList contains the element "Durian" and print the result
        boolean containsDurian = linkedList.contains("Durian");
        System.out.println("LinkedList contains Durian: " + containsDurian);

        // Insert the element "Grapes" at index 2 in the LinkedList
        linkedList.add(2, "Grapes");
        System.out.println("LinkedList after adding Grapes: " + linkedList);

        // Remove the element "Cherry" from the LinkedList
        // boolean removed = linkedList.remove("Cherry");
        linkedList.remove("Cherry");
        System.out.println("LinkedList after removing Cherry: " + linkedList);

        // Iterate over the elements of the LinkedList and print each element
        System.out.print("Elements in LinkedList: ");
        for (String element : linkedList) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Clear the LinkedList and print the empty LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}