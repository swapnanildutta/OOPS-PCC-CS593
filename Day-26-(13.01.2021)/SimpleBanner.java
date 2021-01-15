import java.awt.*;
import java.applet.*;

public class SimpleBanner extends Applet implements Runnable {
    String m = "A simple moving Banner ";
    Thread t;
    boolean stopFlag = false;

    public void init() {
        setBackground(Color.gray);
        setForeground(Color.red);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void paint(Graphics g) {
        Font f = new Font("Calibri", Font.BOLD, 25);
        g.setFont(f);
        char ch = m.charAt(0);
        m = m.substring(1, m.length());
        m += ch;
        g.drawString(m, 50, 30);
    }

    public void run() {
        for (;;) {
            try {
                repaint();
                Thread.sleep(150);
                if (stopFlag)
                    break;
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}