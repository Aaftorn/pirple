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
public class Planes extends Vehicle {
    private boolean isFlying;
    
    public Planes(String Make, String Model, int Year, double Weight)
    {
        super(Make, Model, Year, Weight);
        this.isFlying = false;
    }
    
    public boolean Fly()
    {  
        if (this.NeedsMaintenance)
        {
            System.out.println("Can't fly until repair");
            return false;
        }
        this.isFlying = true;
        return true;
    }
    public void Land()
    {
        if (this.isFlying)
        {
            this.isFlying = false;
            this.TripsSinceMaintenance++;
        }
        else
        {
            return;
        }
        if (this.TripsSinceMaintenance>100)
        {
            this.NeedsMaintenance = true;
        }
    }
    public void Repair()
    {
        this.TripsSinceMaintenance = 0;
        this.NeedsMaintenance = false;
    }
}
