//(a)    
        import java.util.Scanner;

        public class Complex {
            private double real;
            private double imaginary;

            public Complex(double real, double imaginary) {
                this.real = real;
                this.imaginary = imaginary;
            }

            public Complex add(Complex other) {
                double newReal = this.real + other.real;
                double newImaginary = this.imaginary + other.imaginary;
                return new Complex(newReal, newImaginary);
            }

            public Complex subtract(Complex other) {
                double newReal = this.real - other.real;
                double newImaginary = this.imaginary - other.imaginary;
                return new Complex(newReal, newImaginary);
            }

            public Complex multiply(Complex other) {
                double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
                double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
                return new Complex(newReal, newImaginary);
            }

            public Complex divide(Complex other) {
                double divisor = (other.real * other.real) + (other.imaginary * other.imaginary);
                double newReal = ((this.real * other.real) + (this.imaginary * other.imaginary)) / divisor;
                double newImaginary = ((this.imaginary * other.real) - (this.real * other.imaginary)) / divisor;
                return new Complex(newReal, newImaginary);
            }

            public String toString() {
                if (imaginary >= 0) {
                    return real + " + " + imaginary + "i";
                } else {
                    return real + " - " + (-imaginary) + "i";
                }
            }

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter the real and imaginary parts of the first complex number:");
                System.out.print("Real part: ");
                double real1 = scanner.nextDouble();
                System.out.print("Imaginary part: ");
                double imaginary1 = scanner.nextDouble();

                System.out.println("\nEnter the real and imaginary parts of the second complex number:");
                System.out.print("Real part: ");
                double real2 = scanner.nextDouble();
                System.out.print("Imaginary part: ");
                double imaginary2 = scanner.nextDouble();

                Complex complex1 = new Complex(real1, imaginary1);
                Complex complex2 = new Complex(real2, imaginary2);

                Complex sum = complex1.add(complex2);
                Complex difference = complex1.subtract(complex2);
                Complex product = complex1.multiply(complex2);
                Complex quotient = complex1.divide(complex2);

                System.out.println("\nArithmetic operations on complex numbers:");
                System.out.println("Complex 1: " + complex1);
                System.out.println("Complex 2: " + complex2);
                System.out.println("Sum: " + sum);
                System.out.println("Difference: " + difference);
                System.out.println("Product: " + product);
                System.out.println("Quotient: " + quotient);
            }
        }


//(b)

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        int days = getNumberOfDays(month);
        System.out.println("Number of days in the month: " + days);
    }

    public static int getNumberOfDays(int month) {
        int days;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                days = 31;
                break;

            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                days = 30;
                break;

            case 2: // February
                days = 28; // Assuming it's not a leap year
                break;

            default:
                days = -1; // Invalid month
                break;
        }

        return days;
    }
}

