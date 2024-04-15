package fractol;



import java.awt.*;

public class graph {


    static Z getMouseZ(int x, int y, int w, int h,double regx,double regy)
    {
        int px;
        int py;
        int cnterx = w / 2;
        int cntery = h / 2;

            px =     x - cnterx;
            py =    cntery - y;

   return new Z((px * regx) / cnterx,(py * regy)/ cntery);}
}
