public class BankAccount{

	private double balance;
	private int accountID;
	private String password;

	public BankAccount(double newBalance, int newAccountID, String newPassword) {
		balance = newBalance;
		accountID = newAccountID;
		password = newPassword;
	}

	public double getBalance() {
		return balance;
}

	public int getAccountID() {
		return accountID;
}

	public void setPassword(String newPasswords) {
		password = newPasswords;
}

//should change this to make easier
  public String toString() {
    String result = "";
    result += accountID + "\t" + balance;
    return result;
  }


	public boolean deposit(double depositAmount) {
		if (depositAmount < 0)
			return false;
		else
			balance = balance + depositAmount;
			return true;
	}


  private boolean authenticate(String newPassword){
  if ((this.password).equals(newPassword))
    return true;
  else
    return false;
}


  public boolean withdraw(double amount){
    if ((balance >= amount) && (amount > 0)) {
      balance = balance - amount;
      return true;
    }
    else {
      return false;
    }
  }

public boolean transferTo(BankAccount other, double amount, String password) {
		if (other.authenticate(password) && this.withdraw(amount))
      return (other.authenticate(password) && other.deposit(amount));
    return false;
	}

}

///////////////////////////////////////////////////
/*
Homework:
write a bank account class as follows. You need a Driver to test it. Make a repo MKS21X-Bank
Make sure your repo is public and named exactly.

class name:
        BankAccount

Instance variables required:
      balance - a double
      accountID - int [the account number, an integer]
      password - String

Methods Required:
1. A constructor: Should accept values for EACH of the instance variables
2. get methods for balance, accountID
3. set method for password
4. A toString method that returns (tab separated values):  "AccountID\tBalance"
           e.g. "100203    1023.45"
5a. A method to deposit money into the account.
    It should accept an amount of money, increase the account balance
    by that much, and return true. However, when the argument given is a negative
    deposit, instead it should leave the balance unchanged and returning false.
5b. Method to withdraw money from the account (subtract from the balance) and
    return true if it was successful,false otherwise. This will not be successful
    if the balance is too low, in which case the action does not change the balance.
6. A main method (in a separate driver file) to test your code.


Since withdraw and deposit return booleans. We can use them as follows:

       hint:
       if( var.withdraw(1000) ){
            println("Withdrawal success!");
       }else{
            println("Withdrawal failure");
       }
*/
