
/**
 * Write a description of class MonteCarlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.lang.Math.*;
import java.util.Random.*;
public class MonteCarlo
{
    // instance variables - replace the example below with your own
    private double x,y,l,l1;
    private Random rndm = new Random();
    public double height;
    public double width;
    public double radius;
    /**
     * Constructor for objects of class MonteCarlo
     * @param height, width, and radius
     */
    public MonteCarlo(double h,double k,double r)
    {
        height = h;
        width = k;
        radius = Math.abs(r);   
        l = h-r;
        l1 = k-r;
    }

    /**
     * Random rain drop x coordinate;
     * 
     * @return     return a random x
     */
    public double nextRainDrop_x()
    {        
        x = l + ((2 * radius) * rndm.nextDouble());
        System.out.println(x);
        return x;
    }
    /**
     * Random rain drop y coordinate;
     * 
     * @return return a random y
     */
    public double nextRainDrop_y()
    {
        y = l1 + (2 * radius) *rndm.nextDouble();
        System.out.println(y);
        return y;
    }
    /**
     * Check if rain drop is inside the circle
     * 
     * @return a true or flase
     */
    public boolean insideCircle(double x, double y)
    {
        if((Math.pow((x - height), 2))+ (Math.pow((y - width), 2)) <= Math.pow(radius,2))
        {
         return true;  
        }
        else
        {
         return false;
        }
    }
}
