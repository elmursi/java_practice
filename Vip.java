public class Vip {
  private String name;
  private String email;
  private double creditLimit;

  //default empty constructor with default values
  public Vip() {
    this("Default Name", "Default Email", 1000);
  }

  //constructor with 2 parameters and default creditLimit
  public Vip(String name, String email) {
    this(name, email, 1000);
  }

  //constructor with 3 parameters
  public Vip(String name, String email, double creditLimit) {
    this.name = name;
    this.email = email;
    this.creditLimit = creditLimit;
  }


  //getters 
  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  //show details method
  public void showDetails() {
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Credit Limit: " + creditLimit);
  }

  
  
}
