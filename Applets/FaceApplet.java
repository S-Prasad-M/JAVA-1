import java.awt.*;
import java.applet.*;

public class FaceApplet extends Applet {
    public void paint(Graphics g) 
    {
        setBackground(Color.white);
        g.setColor(Color.yellow);  
        g.fillOval(50, 50, 200, 200);   // face outline
        g.setColor(Color.black);
        g.fillOval(100, 110, 40, 40);   // eye 1
        g.fillOval(180, 110, 40, 40);   // eye 2
        g.setColor(Color.red);
        g.drawArc(100, 150, 120, 80, 180, 180);     // mouth
    }
}
