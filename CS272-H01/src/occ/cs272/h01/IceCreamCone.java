/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author <cle173>
 * @version <09/09/2019>
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "cle173";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
    private double radius;
    private double height;
    private double SurfaceArea;
    private double Volume;
    
    public IceCreamCone() {
        radius = 0;
        height = 0;
    }
    
    public IceCreamCone(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    
    public double getSurfaceArea() {
        
        SurfaceArea = Math.PI * radius * (Math.sqrt((Math.pow(height, 2) + Math.pow(radius, 2))));        
        return SurfaceArea;
    }
    public double getVolume() {
        
        Volume = Math.PI * (Math.pow(radius, 2) * (height / 3));
        return Volume;
    }
    
}
