import java.awt.*;
import java.applet.*;
public class Figure1PPT extends Applet{
    public void paint(Graphics g)
    {
        setBackground(Color.CYAN);
        g.setColor(Color.RED);
        g.drawRect(100, 100, 50, 50);
        g.setColor(Color.GREEN);
        g.fillOval(100, 100, 50, 50);
    }
}
