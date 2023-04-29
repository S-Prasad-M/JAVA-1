class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

public class Emp {
    public static void main(String[] args) {
        Manager manager = new Manager("Shree Prasad", 150000.0, "Software");
        System.out.println(manager.getName() + " is a Software Developer in the " + manager.getDepartment() + " department and earns \4" + manager.getSalary() + " per year.");
    }
}
