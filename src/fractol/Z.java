package fractol;


public class Z
{
    public double  X = 0 ;
    public double Y = 0;
    public double getX(){return X;}
    public double getY(){return Y;}
    Z(double X,double Y)
    {
        this.X = X;
        this.Y = Y;
    }

    static double getmodulus(Z z)
    {

        return  Math.sqrt(z.X * z.X + z.Y * z.Y);
    }
    
    static  Z getZ2(Z z)
    {
        double x = (z.X * z.X - z.Y * z.Y) ;
        double y = 2 *z.X * z.Y  ;
        return  new Z(x , y);
    }
      static  Z getZ2Abs(Z z)
    {
        double x = (z.X * z.X - z.Y * z.Y) ;
        double y = 2 * Math.abs(z.X * z.Y);
        return  new Z(x , y);
    }
    
    static Z sum(Z a,Z b)
    {
        return  new Z(a.X + b.X, b.Y + a.Y);
    }
}
