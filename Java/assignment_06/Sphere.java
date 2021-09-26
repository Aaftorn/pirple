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
public class Sphere {
    private double radius;
    private String unit;
    
    public Sphere(double radius, String unit)
    {
        this.radius = radius;
        this.unit = unit;
    }
    
    public String radius()
    {
        return this.radius + this.unit;
    }
    
    public String diameter()
    {
        return this.radius*2 + this.unit;
    }
    
    public String circumference()
    {
        return this.radius*2*Math.PI + this.unit;
    }
    
    public String surface()
    {
        return Math.pow(this.radius,2)*Math.PI*4 + this.unit + "²";
    }
    
    public String volume()
    {
        return Math.pow(this.radius,3)*Math.PI*4/3 + this.unit + "³";
    }
    
}
