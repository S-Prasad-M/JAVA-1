import java.awt.*;
import java.applet.*;
public class BGColor extends Applet
{
    public void init ()
    {
        setBackground (Color.cyan);
    }
    public void paint (Graphics g)
    {
        g.drawString ("This is in the applet window", 10, 20);
    }
}