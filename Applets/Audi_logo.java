import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Audi_logo extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.WHITE);
        g.drawString("AUDI", 400 , 50);
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(250, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(400, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.drawOval(550, 100, 200, 200);
    }
}
