import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/* <applet code="SimpleMovingBanner.class" width=300 height=250></applet> */

public class SimpleMovingBanner extends Applet implements Runnable {
    String str = "A Simple Moving Banner. ";
    Thread t;
    boolean stopFlag;

    @Override
    public void init() {
        setBackground(Color.gray);
        setForeground(Color.red);
    }
    
    @Override
    public void start() {
        t = new Thread(this);
        t.start(); //method of Thread class
    }
    
    @Override
    public void run() {
        for(;;) {
            try {
                repaint(); //method of Component class
                Thread.sleep(250);
                if(stopFlag)
                    break;
            }
            catch(InterruptedException ex) { }
        }
    }
    
    @Override
    public void stop() {
        stopFlag = true;
        t = null;
    }

    // repaint() --> update(Graphics g) --> paint(Graphics g)
    @Override
    public void paint(Graphics g) {
        char ch = str.charAt(0);
        str = str.substring(1, str.length());
        str += ch;
        //System.out.println(str);
        g.drawString(str, 70, 70);
    }    
}
