//(A)
        import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter the first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter the last name: ");
                String lastName = scanner.nextLine();

                String email = generateEmail(firstName, lastName);
                System.out.println("Email: " + email);
            }

            public static String generateEmail(String firstName, String lastName) {
                String firstPart = firstName.substring(0, 3);
                String secondPart = lastName.substring(0, 4);
                String domain = "example.com"; // Replace with the desired domain

                return firstPart + "." + secondPart + "@" + domain;
            }
        }

//(B)
        abstract class Stack {
            protected int top;
            protected int maxSize;
            protected int[] array;

            public Stack(int maxSize) {
                this.maxSize = maxSize;
                this.array = new int[maxSize];
                this.top = -1;
            }

            public abstract void push(int item);

            public abstract int pop();

            public boolean isEmpty() {
                return top == -1;
            }

            public boolean isFull() {
                return top == maxSize - 1;
            }
        }

        public class Main {
            public static void main(String[] args) {
                int maxSize = 5; // Define the maximum size of the stack

                Stack stack = new Stack(maxSize) {
                    @Override
                    public void push(int item) {
                        if (isFull()) {
                            System.out.println("Stack Overflow. Cannot push item: " + item);
                        } else {
                            array[++top] = item;
                            System.out.println("Pushed item: " + item);
                        }
                    }

                    @Override
                    public int pop() {
                        if (isEmpty()) {
                            System.out.println("Stack Underflow. Cannot pop item.");
                            return -1;
                        } else {
                            int item = array[top--];
                            System.out.println("Popped item: " + item);
                            return item;
                        }
                    }
                };

                // Perform stack operations
                stack.push(10);
                stack.push(20);
                stack.pop();
                stack.pop();
                stack.pop();
            }
        }
