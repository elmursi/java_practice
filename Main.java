class Main{
  public static void main(String[] args){
    
    Bank account = new Bank();
    account.setAccountNumber(12345);
    account.setCustomerName("John Smith");
    account.setEmail("John@mail.ca"); 
    account.setPhoneNumber("123-456-7890");

    account.deposit(100);
    account.withdraw(50);
    account.withdraw(100);
    account.deposit(100);
    account.withdraw(100);
    account.deposit(50);
    account.withdraw(100);
    //show the account information
    account.showDetails();

    //create a new Vip
    Vip vip = new Vip();
    //show the vip information
    vip.showDetails();

    //create a new Vip
    Vip vip2 = new Vip("John Smith","John@maiul.ca");

    //show the vip information
    vip2.showDetails();

    //create a new Vip
    Vip vip3 = new Vip("John Smith","SMith@Rogers.ca", 200000);

    //show the vip information
    vip3.showDetails();




  }
}
