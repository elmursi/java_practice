package vehicle;

public class Outlander extends Car {
  private int roadServiceMonths;

  public Outlander(int roadServiceMonths) {
    super("Outlander", "V6", 4, 5, 6, false);
    this.roadServiceMonths = roadServiceMonths;
  }

  //accelerate
  public void accelerate(int rate){
    int newVelocity = getCurrentVelocity() + rate;
    if(newVelocity == 0){
      stop();
      changeGear(1);
      
  }
  else if(newVelocity > 0 && newVelocity <= 10){
    changeGear(1);
  }
  else if ( newVelocity >10 && newVelocity <= 20 ){
    changeGear(2);
  }
  else if ( newVelocity > 20 && newVelocity <=30 ){
    changeGear(3);
  }
  else{
    changeGear(4); //

  }

  //change velocity
  if(newVelocity > 0){
    changeVelocity(newVelocity, getCurrentDirection());
  }
  
}
  // //decelerate
  // public void decelerate(int rate){
  //   int newVelocity = getCurrentVelocity() - rate;
  //   if(newVelocity == 0){
  //     stop();
  //     changeGear(1);
  //   }
  //   else if(newVelocity > 0){
  //     changeGear(getCurrentVelocity());
  //   }
  // }
  // //change gear
  // public void changeGear(int currentGear){
  //   this.currentGear = currentGear;
  //   System.out.println("Outlander.changeGear(): Changed to gear " + this.currentGear);
  // }
  // //stop
  // public void stop(){
  //   changeVelocity(0, 0);
  // }
  
}
