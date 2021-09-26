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
public class Cars extends Vehicle {
    private boolean isDriving;
    
    public Cars(String Make, String Model, int Year, double Weight)
    {
        super(Make, Model, Year, Weight);
        this.isDriving = false;
    }
    
    public void Drive()
    {  
        this.isDriving = true;
    }
    public void Stop()
    {
        if (this.isDriving)
        {
            this.isDriving = false;
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
