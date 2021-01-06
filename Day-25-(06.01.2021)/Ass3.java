import java.awt.*;
import java.applet.*;

/* <applet code="Ass3.class" width=300 height=250></applet> */

public class Ass3 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(getWidth() / 2 - 200, getHeight() / 2 - 200, 400, 400);
    }
}