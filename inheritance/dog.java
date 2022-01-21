package inheritance;

public class dog extends Animal {
  //additional fields
  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;


  //constructor
  //initialize the dog as an animal
  // public dog(String name, int brain, int body, int size, int weight) {
  //   super(name, brain, body, size, weight);
  // }

  //constructor
  public dog(String name,int size, int weight, int eyes,int legs, int tail,int teeth, String coat ){
    super(name,1,1,size,weight);
    this.eyes = eyes;
    this.legs = legs;
    this.tail = tail;
    this.teeth = teeth;
    this.coat = coat;
  }

  //unique method to dog
  private void chew(){
    System.out.println("Dog.chew() called");
  }

  //override the animal eat method
  @Override
  public void eat(){
    System.out.println("Dog.eat() called");
    chew();
    super.eat();
  }


  
}
