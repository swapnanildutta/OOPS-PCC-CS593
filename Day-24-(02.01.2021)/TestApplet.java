import java.applet.Applet;
import java.awt.Graphics;

/* <applet code="TestApplet.class" width=300 height=250></applet> */

public class TestApplet extends Applet {
    @Override
    public void init() {
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
        g.drawString("Hello World", 50, 70);
        g.drawString("Goodbye", 50, 90);
    }    
}
