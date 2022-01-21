class Main{
  public static void main(String[] args){
    
    Bank account = new Bank();
    account.setAccountNumber(12345);
    account.setCustomerName("John Smith");
    account.setEmail("John@mail.ca"); 
    account.setPhoneNumber("123-456-7890");

    //show the account information
    account.showDetails();

    account.deposit(100);

    //show the account information
    account.showDetails();




  }
}
