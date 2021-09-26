/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advancedoop;

import java.util.Random;

/**
 *
 * @author Seydel
 */
public class Advancedoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cars car1 = new Cars("Opel","Astra",2015,1280);
        Cars car2 = new Cars("Mercedes-Benz","C-class",2018,1690);
        Cars car3 = new Cars("Volkswagen","Beetle",1973,820);
        
        Random rand = new Random();
        
        for(int i=0; i<250; i++)
        {
            double whichToDrive = rand.nextDouble();
            if (whichToDrive>0.5)
            {
                car1.Drive();
                car1.Stop();
            }
            else if (whichToDrive>0.2)
            {
                car2.Drive();
                car2.Stop();
            }
            else
            {
                car3.Drive();
                car3.Stop();
            }
        }
        
        car1.Print();
        car2.Print();
        car3.Print();
    }
    
}
