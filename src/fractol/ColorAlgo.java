package fractol;



import java.awt.Color;

public class ColorAlgo
{

   
   public static Color getColor(int iteration, int maxIterations) {
        if (iteration == maxIterations) {
            return Color.BLACK; 
        }
        double t = (double) iteration / maxIterations;
        int red = (int) (9 * (1 - t) * t * t * t * 255);
        int green = (int) (15 * (1 - t) * (1 - t) * t * t * 255);
        int blue = (int) (8.5 * (1 - t) * (1 - t) * (1 - t) * t * 255);
        return new Color(red, green, blue);
    }
}
