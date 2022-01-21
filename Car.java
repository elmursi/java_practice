public class Car {
  
  //define state || fields
  //private don't allow class outside of this class to access these fields
  private int doors;
  private int wheels;
  //change model to public so it can be accessed outside of this class
  // public String model;
  private String model;
  private String engine;
  private String color;

  //define behavior || methods
public void setModel(String model){
  //this refers to the field of the current object || porsche
  String validModel = model.toLowerCase();
  //test if the model is valid
  if (validModel.equals("carrera") || validModel.equals("commodore")){
    this.model = model;
  } else {
    this.model = "Unknown";
  }
}
 


  public String getModel(){
    return this.model;
  }


  
}
