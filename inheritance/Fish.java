package inheritance;

public class Fish extends Animal {
  //additional fields
  private int gills;
  private int fins;
  //eyes
  private int eyes;


  //constructor
  //initialize the fish as an animal
  public Fish(String name, int brain, int body, int size, int weight, int gills, int fins, int eyes) {
    super(name, brain, body, size, weight);
    this.gills = gills;
    this.fins = fins;
    this.eyes = eyes;

  }

  //methods
  //rest
  private void rest(){

  }

  //movemuscles
  private void moveMuscles(){

  }

  //movebackfin
  private void moveBackFin(){

  }

  //siwm
  public void swim(int speed){
    moveMuscles();
    moveBackFin();
    super.move(speed);

    System.out.println("Fish.swim() called. Fish is swimming at " + speed);
  }

  }


  

