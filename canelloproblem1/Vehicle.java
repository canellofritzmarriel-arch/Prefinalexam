package canelloproblem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class Vehicle {
    String brand;
    String model;
    int year;
    engine engine;

    public engine getEngine() {
        return engine;
    }

    public void setEngine(engine engine) {
        this.engine = engine;
    }
    
    abstract class engine {
    public abstract void start_engine();
    public abstract void stop_engine();

    }
  public void start_engine(){
      System.out.println(" Start");
      
  }    
  
  public void stop_engine(){
      System.out.println(" Stop");
      
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", model=" + model + ", year=" + year + ", engine=" + engine + '}';
    }
   
    
}
