import java.applet.*;  
import java.awt.*;  
public class Demo_applet extends Applet{
 public void init()
    {
          System.out.println("INIT");
      }
    public void start()
    {
        System.out.println("START");
    }
    public void paint(Graphics g)
    {
       // System.out.println("PAINT");
    }
    public void stop()
    {
        System.out.println("STOP");
    }
    public void destroy()
    {
        System.out.println("DESTROY");
    } 
}   
