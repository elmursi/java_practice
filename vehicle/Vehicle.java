package vehicle;

public class Vehicle {
  // instance variables
  private String name;
  private String size;

  private int currentVelocity;
  private int currentDirection;

  // constructor
  public Vehicle(String name,String size){
    this.name = name;
    this.size = size;

    this.currentVelocity = 0;
    this.currentDirection = 0;
      
  }

  //methods
  //steer parameter direction in degrees

  public void steer(int direction) {
    this.currentDirection += direction;
    System.out.println("Vehicle.steer(): Steering at " + direction + " degrees.");

  }

  //move velocity and direction
  public void move(int velocity, int direction) {
    this.currentVelocity = velocity;
    this.currentDirection = direction;
    System.out.println("Vehicle.move(): Moving at " + this.currentVelocity + " in direction " + this.currentDirection);
  }

  //getCurrentVelocity
  public int getCurrentVelocity(){
    return this.currentVelocity;
  }

  //getCurrentDirection
  public int getCurrentDirection(){
    return this.currentDirection;
  }

  //stop vehicle
  public void stop(){
    this.currentVelocity = 0;
    System.out.println("Vehicle.stop(): Stopping.");
  }



  
}
