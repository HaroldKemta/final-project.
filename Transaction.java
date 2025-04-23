// create transaction 

// base case 

import java.util.Date;

public abstract class Transaction {
    protected String type;
    protected double amount;
    protected Date date;
    protected BankAccount account;

    public Transaction(String type, double amount, BankAccount account) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();  // Current date and time of transaction 

        this.account = account;
    }

    public abstract void execute();   // every subclass must define execute 
}


public class DepositTransaction extends Transaction {
    public DepositTransaction(double amount, BankAccount account) {
        super("Deposit", amount, account);
    }

    @Override
    public void execute() {
        account.deposit(amount); // the subclass  deposits using abstaract super class
    }
}
