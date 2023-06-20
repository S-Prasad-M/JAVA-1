//Package 1
package YEAR_I;

public class YearIMarks {
    private int sub1mark;
    private int sub2mark;

    public YearIMarks(int sub1mark, int sub2mark) {
        this.sub1mark = sub1mark;
        this.sub2mark = sub2mark;
    }

    public int getSub1mark() {
        return sub1mark;
    }

    public int getSub2mark() {
        return sub2mark;
    }
}

//Package 2
package YEAR_II;

public class YearIIMarks {
    private int sub3mark;
    private int sub4mark;

    public YearIIMarks(int sub3mark, int sub4mark) {
        this.sub3mark = sub3mark;
        this.sub4mark = sub4mark;
    }

    public int getSub3mark() {
        return sub3mark;
    }

    public int getSub4mark() {
        return sub4mark;
    }
}


// Main java file
import YEAR_I.YearIMarks;
import YEAR_II.YearIIMarks;

class Student {
    private int rollNumber;
    private String name;
    private YearIMarks yearIMarks;
    private YearIIMarks yearIIMarks;

    public Student(int rollNumber, String name, YearIMarks yearIMarks, YearIIMarks yearIIMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.yearIMarks = yearIMarks;
        this.yearIIMarks = yearIIMarks;
    }

    public String calculateGrade(int marks) {
        return marks >= 50 ? "Pass" : "Fail";
    }

    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);

        int sub1mark = yearIMarks.getSub1mark();
        int sub2mark = yearIMarks.getSub2mark();
        int sub3mark = yearIIMarks.getSub3mark();
        int sub4mark = yearIIMarks.getSub4mark();

        System.out.println("Subject 1: " + sub1mark + " - Grade: " + calculateGrade(sub1mark));
        System.out.println("Subject 2: " + sub2mark + " - Grade: " + calculateGrade(sub2mark));
        System.out.println("Subject 3: " + sub3mark + " - Grade: " + calculateGrade(sub3mark));
        System.out.println("Subject 4: " + sub4mark + " - Grade: " + calculateGrade(sub4mark));
    }

    public static void main(String[] args) {
        YearIMarks yearIMarks = new YearIMarks(70, 85);
        YearIIMarks yearIIMarks = new YearIIMarks(65, 55);

        Student student = new Student(123, "John Doe", yearIMarks, yearIIMarks);
        student.displayResult();
    }
}
