import java.applet.Applet;
import java.awt.Graphics;

public class Ass5 extends Applet {
    String s = "";

    @Override
    public void init() {
        System.out.println("init() called");
        s += "init() called ";
    }

    @Override
    public void start() {
        System.out.println("start() called");
        s += "start() called ";
    }

    @Override
    public void stop() {
        System.out.println("stop() called");
        s += "stop() called ";
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
        s += "destroy() called ";
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Hello World", 50, 70);
        g.drawString("Goodbye", 50, 90);
        g.drawString(s, 50, 120);
    }
}