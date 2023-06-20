public class TestThreadMany {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a positive integer as command line argument.");
            return;
        }

        int n = Integer.parseInt(args[0]);

        if (n <= 0) {
            System.out.println("Invalid input. Please provide a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            Thread thread = new Thread(() -> {
                System.out.println("Hello, I am Thread #" + Thread.currentThread().getId());
            });
            thread.start();
        }
    }
}
