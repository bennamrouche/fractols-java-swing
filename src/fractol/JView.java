package fractol;





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.util.Random;

public class JView extends JPanel  implements MouseListener , MouseMotionListener, MouseWheelListener {
Z z0 = new Z(0.5,-0.5);
double xscale_p = 2;
double yscale_p = 2;
double xscale_n = -2;
double yscale_n = -2;
public boolean ismouse_enb = true;
    public JView() {

        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, 600, 600);
        this.setVisible(true);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);
        this.addKeyListener(new key(this));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        this.requestFocus();
            int i =0;
       for (int x = 0 ; x <= 600; x++) {
           for (int y = 0  ; y <= 600; y++)
            {
              Z  comp = new Z(map(x,xscale_n,xscale_p),map(y,yscale_n,yscale_p));
              
                if(Main.FRACTAL_NO == Main.MANDELBROT_NO)
                    i =   Fractals.getMandelbortIteration(comp);
                else if(Main.FRACTAL_NO == Main.JULIA_NO)
                    i = Fractals.getJuliaIteration(comp, z0);
                  else if(Main.FRACTAL_NO == Main.BURNING_SHIP_NO)
                    i = Fractals.getBurningShipIteration(comp);
                
                   g.setColor(ColorAlgo.getColor(i, Main.MAX_ITARATION));
               g.drawLine(x,y,x ,y);
            }

        }

    }


static  double  map(int x,double pos1 , double pos2)
    {

        double d_double = Math.abs(pos1 - pos2);

        double persn = x /600.0;
        double res = pos1 + (persn  *d_double);
        return res;
    }








    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

        if (ismouse_enb)
        {
            z0.X = JView.map(e.getX(), xscale_n, xscale_p);
            z0.Y = JView.map(e.getY(), yscale_n, yscale_p);
        }
     //  z0 = new graph.getMouseZ(e.getX(),e.getY(),800,800 ,2,2);


        repaint();
    }
    Z zoom = new Z(0,0);
    @Override
    public void mouseWheelMoved(MouseWheelEvent mwe) {

        int wheel =  mwe.getWheelRotation() ;

    zoom.X = JView.map(mwe.getX(), xscale_n, xscale_p);
    zoom.Y = JView.map(mwe.getY(), yscale_n, yscale_p);
     

        if (wheel < 0)
        {

            xscale_n += zoom.X;
            xscale_p += zoom.X;
            yscale_n += zoom.Y;
            yscale_p += zoom.Y;

            xscale_n *= 0.5;
            xscale_p *= 0.5;
            yscale_n *= 0.5;
            yscale_p *= 0.5;
        }
        else
        {
        xscale_n /= .5;
        xscale_p /= .5;
        yscale_n /= .5;
        yscale_p /= .5;

        xscale_n -= zoom.X;
        xscale_p -= zoom.X;
        yscale_n -= zoom.Y;
        yscale_p -= zoom.Y;


        }
        repaint();
    }
}
