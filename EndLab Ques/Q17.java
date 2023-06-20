// (A)        
            public class PriorityThreadDemo {
                public static void main(String[] args) {
                    Thread highPriorityThread = new Thread(new WorkerThread(), "High Priority Thread");
                    Thread lowPriorityThread1 = new Thread(new WorkerThread(), "Low Priority Thread 1");
                    Thread lowPriorityThread2 = new Thread(new WorkerThread(), "Low Priority Thread 2");

                    lowPriorityThread1.setPriority(Thread.MIN_PRIORITY);
                    lowPriorityThread2.setPriority(Thread.MIN_PRIORITY);
                    highPriorityThread.setPriority(Thread.MAX_PRIORITY);

                    lowPriorityThread1.start();
                    lowPriorityThread2.start();
                    highPriorityThread.start();
                }

                static class WorkerThread implements Runnable {
                    public void run() {
                        System.out.println("Thread running: " + Thread.currentThread().getName());
                        for (int i = 1; i <= 5; i++) {
                            System.out.println(Thread.currentThread().getName() + ": " + i);
                        }
                    }
                }
            }

//(B)
        import java.io.File;
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.Scanner;
        public class FileConversion {
            public static void main(String[] args) {
                String inputFilename = "input.txt";
                String outputFilename = "output.txt";

                try {
                    File inputFile = new File(inputFilename);
                    File outputFile = new File(outputFilename);

                    Scanner scanner = new Scanner(inputFile);
                    FileWriter writer = new FileWriter(outputFile);

                    while (scanner.hasNext()) {
                        String word = scanner.next();
                        String lowercaseWord = word.toLowerCase();
                        writer.write(lowercaseWord + " ");
                    }

                    scanner.close();
                    writer.close();

                    System.out.println("File conversion completed. Output written to " + outputFilename);
                } catch (IOException e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }
