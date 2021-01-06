import java.awt.*;
import java.applet.*;

public class Ass3 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(getWidth() / 2 - 200, getHeight() / 2 - 200, 400, 400);
    }
}