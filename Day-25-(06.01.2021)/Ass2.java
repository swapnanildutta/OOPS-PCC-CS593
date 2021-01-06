import java.applet.*;
import java.awt.*;

public class Ass2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillOval(getWidth() / 2 - 250, getHeight() / 2 - 250, 500, 500);
    }
}