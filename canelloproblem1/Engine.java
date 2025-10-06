/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canelloproblem1;

/**
 *
 * @author User
 */
public class Engine {
   private int Horsepower; 
   private String Fuel_type;

    public Engine(int Horsepower, String Fuel_type) {
        this.Horsepower = Horsepower;
        this.Fuel_type = Fuel_type;
        
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int Horsepower) {
        this.Horsepower = Horsepower;
    }

    public String getFuel_type() {
        return Fuel_type;
    }

    public void setFuel_type(String Fuel_type) {
        this.Fuel_type = Fuel_type;
    }

    @Override
    public String toString() {
        return "Engine{" + "Horsepower=" + Horsepower + ", Fuel_type=" + Fuel_type + '}';
    }
   
   
   
}
