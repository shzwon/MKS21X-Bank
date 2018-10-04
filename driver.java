public class Driver {

  public static void main(String[] args) {
    BankAccount acc = new BankAccount(203.43,320022,"z12345");
    // constructor creates balance, account ID, and password

    System.out.println(acc.toString());
    // prints account value numbres

    System.out.println(acc.getBalance());
    // prints current account balance

    System.out.println(acc.getAccountID());
    // prints account ID

    System.out.println(acc.getPassword());
    // print password

    acc.setPassword("zb12345");
    System.out.println(acc.getPassword());
    /* changes password to "zb12345"
       prints new password; a test
     */

    if(acc.withdraw(400.0)) {
      System.out.println("Withdrawal success!");
    } else { System.out.println("Withdrawal failure"); }
    System.out.println(acc.getBalance());
    // should succeed

    if(acc.deposit(30.0)) {
      System.out.println("Deposit success!");
    } else { System.out.println("Deposit failure"); }
    System.out.println(acc.getBalance());
    // should succeed

    if(acc.withdraw(700.0)) {
      System.out.println("Withdrawal success!");
    } else { System.out.println("Withdrawal failure"); }
    System.out.println(acc.getBalance());
    /* should fail
       no change to balance
     */

    if(acc.deposit(-20.0)) {
      System.out.println("Deposit success!");
    } else { System.out.println("Deposit failure"); }
    System.out.println(acc.getBalance());
    /* should fail
       negative value faol deposition
     */

  }

}
