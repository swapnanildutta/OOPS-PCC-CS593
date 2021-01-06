import java.awt.*;
import java.applet.*;

/* <applet code="AppletMethods.class" width=300 height=250></applet> */

public class AppletMethods extends Applet {
    int x = 10;
    String h = "";

    public void init() {
        setBackground(Color.gray);
        setForeground(Color.red);
    }

    public void start() {
        if (x % 2 == 0) {
            h = "even";
        } else {
            h = "odd";
        }
    }

    public void paint(Graphics g) {
        g.drawString("The number " + x + " is " + h, 60, 60);
    }
}
