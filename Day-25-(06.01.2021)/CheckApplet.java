import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* <applet code="CheckApplet.class" width=300 height=250></applet> */

public class CheckApplet extends Applet {

    @Override
    public void init() {
        setBackground(Color.lightGray);
        setForeground(Color.red);
    }

    @Override
    public void paint(Graphics g) {
        int w = getWidth();
        int h = getHeight();
        g.drawLine(30, 40, 60, 70);
        g.setColor(Color.blue);
        g.drawString("Width : " + w + "; Height: " + h, 80, 80);
        g.setColor(Color.green);
        g.fillOval(120, 120, 40, 30);
        g.setColor(Color.red);
        int x[] = {120, 160, 160, 120};
        int y[] = {120, 120, 140, 140};
        g.drawPolygon(x, y, 4);        
    }
    
}
