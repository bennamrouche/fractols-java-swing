
package fractol;

import static fractol.Z.getZ2;
import static fractol.Z.getmodulus;
import static fractol.Z.sum;



public class Fractals 
{
 

public  static int getMandelbortIteration(Z c) {
        int i = 0;
       Z tmp = c ;
        double mod = getmodulus(tmp);
        while (0 < mod && mod <= 2 && i < Main.MAX_ITARATION)
        {

            tmp = getZ2(tmp);
            tmp  = sum(tmp, c);
            i ++;
            mod = getmodulus(tmp);
        }
        return i;
    }
        
 public static int getJuliaIteration(Z z0,Z c) {
        int i = 0;
  Z tmp = sum(z0, c);

    double mod = getmodulus(tmp);
        while (0 < mod && mod <= 2 && i <  Main.MAX_ITARATION)
        {

            tmp = getZ2(tmp);
                tmp  = sum(tmp, c);   
            i ++;
            mod = getmodulus(tmp);
        }
        return i;
    }
    
    


public  static int getBurningShipIteration(Z c) {
        int i = 0;
       Z tmp = c ;
        double mod = getmodulus(tmp);
        while (0 < mod && mod <= 2 && i < Main.MAX_ITARATION)
        {

            tmp = Z.getZ2Abs(tmp);
            tmp  = sum(tmp, c);
            i ++;
            mod = getmodulus(tmp);
        }
        return i;
    }
}