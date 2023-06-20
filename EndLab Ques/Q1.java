import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        System.out.println("Enter the marks for 5 subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averageMarks = (double) totalMarks / marks.length;
        String grade = calculateGrade(averageMarks);

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }

    public static String calculateGrade(double marks) {
        if (marks >= 91 && marks <= 100) {
            return "O (Outstanding)";
        } else if (marks >= 81 && marks <= 90) {
            return "A+ (Excellent)";
        } else if (marks >= 71 && marks <= 80) {
            return "A (Very Good)";
        } else if (marks >= 61 && marks <= 70) {
            return "B+ (Good)";
        } else if (marks >= 50 && marks <= 60) {
            return "B (Average)";
        } else {
            return "RA";
        }
    }
}
