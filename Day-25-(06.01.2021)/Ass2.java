import java.applet.*;
import java.awt.*;

/* <applet code="Ass2.class" width=300 height=250></applet> */

public class Ass2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.cyan);
        g.fillOval(getWidth() / 2 - 250, getHeight() / 2 - 250, 500, 500);
    }
}