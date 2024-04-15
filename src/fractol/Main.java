package fractol;



import javax.swing.*;
import java.io.FileNotFoundException;


public class Main {
    
    public static int           FRACTAL_NO = 1;
    public final static int     MANDELBROT_NO = 0;
    public final static int     JULIA_NO = 1;
    public final  static int    BURNING_SHIP_NO = 2;
    public final static int     MAX_ITARATION = 150;
    
    
    public static void main(String[] args) throws FileNotFoundException {
        Frame v = Frame.getInstace();

    v.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
