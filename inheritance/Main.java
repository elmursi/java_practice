package inheritance;

class Main{
  public static void main(String[] args){
    
    System.out.println("Welcome to inheritance");
    //create an animal
    Animal animal = new Animal("Animal",1,1,1,1);

    //create a dog
    dog dog = new dog("dog",1,1,1,1,1,1,"white");
    
    dog.eat();
    dog.walk();
    dog.run();


    //fish
    Fish fish = new Fish("fish",1,1,1,1,1,1,1);
    fish.eat();
    fish.swim(10);
    

}

}