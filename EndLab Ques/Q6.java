class Student {
    protected String name;
    protected int rollNo;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }
}

class Result extends Student {
    private int marks1;
    private int marks2;
    private int marks3;

    public Result(String name, int rollNo, int marks1, int marks2, int marks3) {
        super(name, rollNo);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getMarks1() {
        return marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public String getResult() {
        int totalMarks = getTotalMarks();
        return totalMarks >= 150 ? "Pass" : "Fail";
    }
}

class Sports extends Result {
    private int sportsPoints;

    public Sports(String name, int rollNo, int marks1, int marks2, int marks3, int sportsPoints) {
        super(name, rollNo, marks1, marks2, marks3);
        this.sportsPoints = sportsPoints;
    }

    public int getSportsPoints() {
        return sportsPoints;
    }
}

public class Main {
    public static void main(String[] args) {
        Sports student1 = new Sports("John", 1, 80, 70, 90, 10);
        Sports student2 = new Sports("Jane", 2, 65, 75, 85, 8);
        Sports student3 = new Sports("Alice", 3, 55, 60, 70, 5);

        displayResult(student1);
        displayResult(student2);
        displayResult(student3);
    }

    public static void displayResult(Sports student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Total Marks: " + student.getTotalMarks());
        System.out.println("Result: " + student.getResult());
        System.out.println("Sports Points: " + student.getSportsPoints());
        System.out.println();
    }
}
