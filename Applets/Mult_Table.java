import java.applet.*;
import java.awt.*;
public class Mult_Table extends Applet {
    public void paint(Graphics g) {
        int count = 20;
        for (int i = 1; i <= 10; i++) {
            int a = i * 10;
            g.drawString(i + " *10 =" + a, 150, count);
            count = count + 20;
        }
    }
}