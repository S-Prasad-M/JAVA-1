interface CreditCardInterface {
    void viewCreditAmount();
    void viewPin();
    void changePin(int newPin);
    void payBalance(double amount);
}

class Customer implements CreditCardInterface {
    private String name;
    private String cardNumber;
    private int pin;
    private double creditAmount;

    public Customer(String name, String cardNumber, int pin) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.creditAmount = 0.0;
    }

    @Override
    public void viewCreditAmount() {
        System.out.println("Credit Amount: $" + creditAmount);
    }

    @Override
    public void viewPin() {
        System.out.println("PIN: " + pin);
    }

    @Override
    public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }

    @Override
    public void payBalance(double amount) {
        if (amount > creditAmount) {
            System.out.println("Invalid payment amount. The credit amount is less than the payment amount.");
        } else {
            creditAmount -= amount;
            System.out.println("Payment of $" + amount + " successfully made. Updated credit amount: $" + creditAmount);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("John", "1234567890123456", 1234);
        customers[1] = new Customer("Jane", "9876543210987654", 5678);
        customers[2] = new Customer("Bob", "5432167890123456", 4321);

        // Perform actions on customer objects
        customers[0].payBalance(100.0);
        customers[1].changePin(9876);
    }
}
