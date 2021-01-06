import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* <applet code="TestingApplet.class" width=300 height=250></applet>  */

public class TestingApplet extends Applet {

    @Override
    public void init() {
        setBackground(Color.gray);
        setForeground(Color.red);
        System.out.println("init() called");
    }

    @Override
    public void start() {
        System.out.println("start() called");
    }
    
    @Override
    public void stop() {
        System.out.println("stop() called");
    }
    
    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }

    @Override
    public void paint(Graphics g) {
        int x[] = {120, 160, 160, 120};
        int y[] = {120, 120, 140,140};
        g.drawString("Hello world", 50, 70);
        g.setColor(Color.yellow);
        g.drawLine(50, 80, 70, 100);
        g.setColor(Color.green);
        g.drawOval(100, 100, 40, 30);
        g.setColor(Color.blue);
        g.drawPolygon(x, y, 4);
    }    
    
}
