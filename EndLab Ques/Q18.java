//(A)
        import java.util.List;
        public class OddIntegerCounter {
            public static <T extends Number> int countOddIntegers(List<T> list) {
                int count = 0;
                for (T number : list) {
                    if (number.intValue() % 2 != 0) {
                        count++;
                    }
                }
                return count;
            }

            public static void main(String[] args) {
                List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
                int oddCount = countOddIntegers(numbers);
                System.out.println("Number of odd integers: " + oddCount);
            }
        }

//(B)
    public class ElementSwapper {
        public static <T> void swapElements(T[] array, int index1, int index2) {
            T temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
        }
        public static void main(String[] args) {
            Integer[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Before swapping: " + Arrays.toString(numbers));
            swapElements(numbers, 1, 3);
            System.out.println("After swapping: " + Arrays.toString(numbers));
        }
    }

//(C)
import java.util.List;

public class MaximalElementFinder {
    public static <T extends Comparable<? super T>> T findMaximalElement(List<T> list, int begin, int end) {
        T maxElement = list.get(begin);
        for (int i = begin + 1; i <= end; i++) {
            T currentElement = list.get(i);
            if (currentElement.compareTo(maxElement) > 0) {
                maxElement = currentElement;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 3, 9, 2, 7, 4);
        int beginIndex = 1;
        int endIndex = 5;
        Integer maxElement = findMaximalElement(numbers, beginIndex, endIndex);
        System.out.println("Maximal element in the range [" + beginIndex + ", " + endIndex + "]: " + maxElement);
    }
}
