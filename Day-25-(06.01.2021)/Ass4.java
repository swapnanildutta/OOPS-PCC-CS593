import java.awt.*;
import java.applet.*;

/* <applet code="Ass4.class" width=300 height=250></applet> */

public class Ass4 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.green);
        for (int i = 0; i * 40 <= getWidth(); i++) {
            if (i % 2 == 0) {
                g.drawLine(i * 40, getHeight() / 2, (i + 1) * 40, getHeight() / 2 + 40);
            } else {
                g.drawLine(i * 40, getHeight() / 2 + 40, (i + 1) * 40, getHeight() / 2);
            }
        }
    }
}