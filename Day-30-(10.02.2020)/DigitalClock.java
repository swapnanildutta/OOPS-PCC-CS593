import java.awt.Color;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.*;

public class DigitalClock extends JApplet implements Runnable {
    String str = "";
    Thread t;
    boolean stopFlag = false;

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

    public void init() {
        setBackground(Color.gray);
        setForeground(Color.green);
    }

    public void start() {
        t = new Thread(this);
        t.start();
    }

    public void stop() {
        stopFlag = true;
        t = null;
    }

    public void destroy() {
    }

    public void paint(Graphics g) {
        super.paint(g);
        Calendar cal = new GregorianCalendar();
        String hh = String.valueOf(cal.get(Calendar.HOUR));
        String mm = String.valueOf(cal.get(Calendar.MINUTE));
        String ss = String.valueOf(cal.get(Calendar.SECOND));
        str = hh + " : " + mm + " : " + ss;
        g.drawString(str, 50, 70);
    }
}