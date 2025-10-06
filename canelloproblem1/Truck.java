package canelloproblem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Truck extends Vehicle {
  private int max_load;
    private String brands;
    private String model;
    private int year;
    engine engine;

    public Truck(int max_load, String brands, String model) {
        this.max_load = max_load;
        this.brands = brands;
        this.model = model;
    }
     @Override
    public String toString() {
        return "Truck{" + "max_load=" + max_load + ", brands=" + brands + ", model=" + model + ", year=" + year + ", engine = " + engine;
    }
    @Override
    public void start_engine(){
        if (this.engine == null) {
            System.out.println("Error: Truck requires Engine to start");
        }
        
    
    }
    public void stop_engine(){
        System.out.println(" Stop");
    }

    public int getMax_load() {
        return max_load;
    }

    public void setMax_load(int max_load) {
        this.max_load = max_load;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }
    
}
