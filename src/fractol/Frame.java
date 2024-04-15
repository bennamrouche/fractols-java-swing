package fractol;




import fractol.JView;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    
   private static Frame _instance;
   
   public static Frame  getInstace()
   {
       if(_instance == null)
              _instance = new Frame();
       return _instance;
   }
   
    public Frame()
    {
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);
        this.setBounds(0, 0, 600, 600);
       
        setLocationRelativeTo(null);
        this.setContentPane(new Menu());
         this.setVisible(true);

    }
}
