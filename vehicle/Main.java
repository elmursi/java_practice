package vehicle;

public class Main {

  public static void main(String[] args) {
    
    //welcome message
    System.out.println("Welcome to the Vehicle Simulator!");

    //Outlander without road service month = 6 months
    Outlander outlander = new Outlander(6);
    outlander.steer(30);
    outlander.move(10, 30);
    outlander.stop();
    outlander.changeGear(2);
    outlander.changeVelocity(50, 30);
    // outlander.decelerate(20);
    outlander.stop();


  }
  
}
