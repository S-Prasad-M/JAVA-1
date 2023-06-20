import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Car {
    protected String regNo;
    protected String model;
    protected String regDate;

    public Car(String regNo, String model, String regDate) {
        this.regNo = regNo;
        this.model = model;
        this.regDate = regDate;
    }

    public abstract void displayDetails();
}

class TransportVehicles extends Car {
    private String validityNo;
    private String startDate;
    private int period;

    public TransportVehicles(String regNo, String model, String regDate, String validityNo, String startDate, int period) {
        super(regNo, model, regDate);
        this.validityNo = validityNo;
        this.startDate = startDate;
        this.period = period;
    }

    public void displayDetails() {
        System.out.println("Transport Vehicle Details:");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + regDate);
        System.out.println("Validity Number: " + validityNo);
        System.out.println("Start Date: " + startDate);
        System.out.println("Period: " + period + " years");
        System.out.println();
    }
}

class PrivateVehicle extends Car {
    private String ownerName;
    private String ownerAddress;

    public PrivateVehicle(String regNo, String model, String regDate, String ownerName, String ownerAddress) {
        super(regNo, model, regDate);
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
    }

    public void displayDetails() {
        System.out.println("Private Vehicle Details:");
        System.out.println("Registration Number: " + regNo);
        System.out.println("Model: " + model);
        System.out.println("Registration Date: " + regDate);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Address: " + ownerAddress);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Car> cars = new ArrayList<>();

        System.out.print("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Vehicle " + i);
            System.out.print("Enter the type (1 - Transport Vehicle, 2 - Private Vehicle): ");
            int type = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the Registration Number: ");
            String regNo = scanner.nextLine();
            System.out.print("Enter the Model: ");
            String model = scanner.nextLine();
            System.out.print("Enter the Registration Date: ");
            String regDate = scanner.nextLine();

            if (type == 1) {
                System.out.print("Enter the Validity Number: ");
                String validityNo = scanner.nextLine();
                System.out.print("Enter the Start Date: ");
                String startDate = scanner.nextLine();
                System.out.print("Enter the Period: ");
                int period = scanner.nextInt();
                scanner.nextLine();

                cars.add(new TransportVehicles(regNo, model, regDate, validityNo, startDate, period));
            } else if (type == 2) {
                System.out.print("Enter the Owner Name: ");
                String ownerName = scanner.nextLine();
                System.out.print("Enter the Owner Address: ");
                String ownerAddress = scanner.nextLine();

                cars.add(new PrivateVehicle(regNo, model, regDate, ownerName, ownerAddress));
            }
        }

        System.out.println("Private Vehicle Details:");
        cars.stream()
                .filter(car -> car instanceof PrivateVehicle)
                .forEach(Car::displayDetails);

        System.out.println("Transport Vehicle Details:");
        cars.stream()
                .filter(car -> car instanceof TransportVehicles)
                .forEach(Car::displayDetails);
    }
}
