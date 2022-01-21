public class Bank {
  
  //fields
  private int accountNumber;
  private double balance;
  private String customerName;
  private String email;
  private String phoneNumber;


  //constructor
  public Bank(int number, double balance, String name, String email, String phone){
    this.accountNumber = number;
    this.balance = balance;
    this.customerName = name;
    this.email = email;
    this.phoneNumber = phone;
  }


  //getters and setters
  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }


  //get and set for customerName
  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  //get and set for email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  //get and set for phoneNumber
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  //Methods
  /*
    * This method allows the customer to deposit funds into their account
    * @param amount the amount of money to deposit
    */
  public void deposit(double amount) {
    this.balance += amount;
    System.out.println("You've deposited $" + amount + " into your account. Your new balance is $" + this.balance);
  }

  /*
    * This method allows the customer to withdraw funds from their account
    * @param amount the amount of money to withdraw
    */
  public void withdraw(double amount) {
    //verify that withdrawal amount is less than or equal to balance
    if (balance - amount <= 0){
      System.out.println("Insufficient funds, You are only allowed to withdraw $" + balance);
    } else {
      this.balance -= amount;
      System.out.println("Withdrawal successful of $" + amount + " Your new balance is $" + balance);
    }
  
  }

  /*
    * This method displays the details of the customer's account
    */

  public void showDetails() {
    System.out.println("Account number: " + this.accountNumber);
    System.out.println("Balance: " + this.balance);
    System.out.println("Customer name: " + this.customerName);
    System.out.println("Email: " + this.email);
    System.out.println("Phone number: " + this.phoneNumber);
  }

  


}
