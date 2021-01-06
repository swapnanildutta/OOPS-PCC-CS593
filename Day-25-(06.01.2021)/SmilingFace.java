import java.awt.*;
import java.applet.*;

/*<applet code="SmilingFace.class" width=300 height=250></applet>*/

public class SmilingFace extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(getWidth() / 2 - 130, getHeight() / 2 - 100, 260, 200);
        g.setColor(Color.black);
        g.fillOval(getWidth() / 2 - 80, getHeight() / 2 - 40, 20, 20);
        g.fillOval(getWidth() / 2 + 65, getHeight() / 2 - 40, 20, 20);
        g.drawArc(getWidth() / 2 - 80, getHeight() / 2 + 20, 160, 40, 180, 180);
    }
}
