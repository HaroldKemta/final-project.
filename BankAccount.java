 public class BankAccount {
    protected int accountNumber;
    protected double balance;
    protected User owner; // Association with User

    public BankAccount(int accountNumber, User owner) {
        this.accountNumber = accountNumber;
        this.owner = owner; // links user object(name) as owner 

        this.balance = 0;
        owner.addAccount(this); // Link this account to user
    }

    public void deposit(double amount) {  // modifier adds $$
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}


public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, User owner, double overdraftLimit) {
        super(accountNumber, owner);
        this.overdraftLimit = overdraftLimit;
    }

    @Override // overrides Speer classes withdraw method 

    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from checking account " + accountNumber);
            return true;
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
            return false;
        }
    }
}


public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, User owner, double interestRate) {
        super(accountNumber, owner);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest of $" + interest + " added to savings account " + accountNumber);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from savings account " + accountNumber);
            return true;
        } else {
            System.out.println("Insufficient funds.");
            return false;
        }
    }
}




