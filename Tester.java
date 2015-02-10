
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.*;
public class Tester {
//    NumberFormat nf = NumberFormat.getNumberInstance();
//    nf.setMinimumFractionDigits(5);
//    nf.setMaximumFractionDigits(5);    
    //double d;   
    static MonteCarlo monteCarlo = new MonteCarlo(5,3,2);
    static double cirCount=0;
    static double sqrCount =0;
    public static void main(String[] args){
        for(int x=0; x < 1000000; x++)
        {
            double randx = monteCarlo.nextRainDrop_x();
            double randy = monteCarlo.nextRainDrop_y();
            if( monteCarlo.insideCircle(randx,randy) == true)
            {
                cirCount ++;
                //System.out.println("cir" + cirCount);
            }
            else {
                sqrCount ++;
                //System.out.println("sqr" + sqrCount);
            }
        }
        System.out.println("Estimated value of PI = " + cirCount/sqrCount);
    }

}
