//Transaction.java
package com.transact;
public class Transaction {
    public static void credit(double amount) {
        // Credit transaction logic
        System.out.println("Crediting amount: " + amount);
    }

    public static void debit(double amount) {
        // Debit transaction logic
        System.out.println("Debiting amount: " + amount);
    }
}


//LoanAccount.java
package com.loan;
import com.transact.Transaction;

public class LoanAccount {
    public void doTransaction(double amount, String transactionType) {
        if (transactionType.equalsIgnoreCase("credit")) {
            Transaction.credit(amount);
        } else if (transactionType.equalsIgnoreCase("debit")) {
            Transaction.debit(amount);
        } else {
            System.out.println("Invalid transaction type!");
        }
    }
}

//Main.java
package com;
import com.loan.LoanAccount;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Insufficient arguments!");
            return;
        }

        double amount = Double.parseDouble(args[0]);
        String transactionType = args[1];

        LoanAccount loanAccount = new LoanAccount();
        loanAccount.doTransaction(amount, transactionType);
    }
}


