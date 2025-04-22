
// import java collections framework 

import java.util.ArrayList;  // used to store multiple bank accounts 
import java.util.List; 


public class User {

  private String name;

  private int userId;

  private List<BankAccount> accounts; // list of bankAccount objust __ each user can have many 


  public User( String name , int userId) {

    this.name = name;

    this.userId = UserId;

    this.accounts = new ArrayList<> (); // creates emoty list of bank accounts for user 

    public void  addAccount(BankAccount account) {

      accounts.add(account);  // stores in user"s account list.
    }

    public void viewAccounts() {
        System.out.println("Accounts for " + name + ":");
        for (BankAccount acc : accounts) {
            System.out.println(" - " + acc.getAccountNumber() + " | Balance: $" + acc.getBalance());
        } // loops thriugh all the bank acciunts in "accounts" and prints 
    }


    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }
}

  


  

  
}
