/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Seydel
 */
public class Oop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sphere testsphere = new Sphere(18,"mm");
        
        System.out.println("radius: " + testsphere.radius());
        System.out.println("diameter: " + testsphere.diameter());
        System.out.println("circumference: " + testsphere.circumference());
        System.out.println("surface: " + testsphere.surface());
        System.out.println("volume: " + testsphere.volume());
        
    }
    
}