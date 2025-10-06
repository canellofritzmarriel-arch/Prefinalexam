package canelloproblem1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Car extends Vehicle {
    private int num_doors;
    private String brands;
    private String model;
    private int year;
    engine engine;
    
    public void start_engine(){
        if (this.engine == null){
            System.out.println("Error: Car requires Engine to start");
        }
    }
    
    public Car(int numb_doors, String brands, String model, int year, engine engine){
        this.num_doors = numb_doors;
        this.brands = brands;
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "numb_doors=" + num_doors + ", brands=" + brands + ", model=" + model + ", year=" + year + ", engine=" + engine + '}';
    }

    public engine getEngine() {
        return engine;
    }

    public void setEngine(engine engine) {
        this.engine = engine;
    }

    public int getNum_doors() {
        return num_doors;
    }

    public void setNum_doors(int num_doors) {
        this.num_doors = num_doors;
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
