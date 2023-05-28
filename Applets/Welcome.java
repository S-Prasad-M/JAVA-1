import java.applet.Applet;
import java.awt.*;

public class Welcome extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.green);
        g.drawString("Welcome to Prasad's Applet Windows", 50, 50);
    }
}