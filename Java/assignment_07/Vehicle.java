/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedoop;

/**
 *
 * @author Seydel
 */
abstract class Vehicle {
    protected String Make;
    protected String Model;
    protected int Year;
    protected double Weight;
    protected boolean NeedsMaintenance;
    protected int TripsSinceMaintenance;
    
    protected Vehicle(String Make, String Model, int Year, double Weight)
    {
        this.Make = Make;
        this.Model = Model;
        this.Year = Year;
        this.Weight = Weight;
        this.NeedsMaintenance = false;
        this.TripsSinceMaintenance = 0;
    }
    
    protected void Print()
    {
        System.out.println("Make: " + this.Make);
        System.out.println("Model: " + this.Model);
        System.out.println("Year: " + this.Year);
        System.out.println("Weight: " + this.Weight);
        System.out.println("NeedsMaintenance: " + this.NeedsMaintenance);
        System.out.println("TripsSinceMaintenance: " + this.TripsSinceMaintenance);
        System.out.println();
    }
    
    
}
