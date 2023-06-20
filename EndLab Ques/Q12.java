class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

class Doctor {
    private int id;
    private String name;
    private int age;
    private String department;

    public Doctor(int id, String name, int age, String department) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 25 || age > 65) {
            throw new AgeNotWithinRangeException("AgeNotWithinRangeException: Age should be between 25 and 65.");
        }

        if (name.matches(".*\\d.*") || name.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            throw new NameNotValidException("NameNotValidException: Name should not contain numbers or special symbols.");
        }

        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Doctor doctor1 = new Doctor(1, "John Doe", 30, "Cardiology");
            System.out.println(doctor1);

            Doctor doctor2 = new Doctor(2, "Jane123", 45, "Pediatrics");
            System.out.println(doctor2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}
