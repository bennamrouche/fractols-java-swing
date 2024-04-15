package fractol;





import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



public class key implements KeyListener
{
    JView v;

    public key(JView v) {
        this.v = v;
    }



    @Override
    public void keyTyped(KeyEvent ke)
    {

    }

    @Override
    public void keyPressed(KeyEvent ke)
    {
    	double dx= Math.abs(v.xscale_n  - v.xscale_p);
    	double dy= Math.abs(v.yscale_n  - v.yscale_p);


         switch(ke.getKeyCode())
      {
          case 40:
        	  v.yscale_n -=  0.2 * dy;
        	  v.yscale_p -=  0.2 * dy;
        	  v.repaint();
        	  break;
          case 38:
        	  v.yscale_n +=  0.2 * dy;
        	  v.yscale_p +=  0.2 * dy;
        	  v.repaint();
                    break;

          case 39:
        	  v.xscale_n -=  0.2 * dx;
        	  v.xscale_p -=  0.2 * dx;
        	  v.repaint(); 
                  break;

          case 37:
        	  v.xscale_n +=  0.2 * dx;
        	  v.xscale_p += 0.2 * dx;
                  v.repaint();
          break;
          case 32: v.ismouse_enb= !v.ismouse_enb;break;
      }

    }

    @Override
    public void keyReleased(KeyEvent ke)
    {


    }

}
