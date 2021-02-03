import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

/* <applet code="SimpleBanner.class" width="400" height="350"></applet>  */

public class SimpleBanner extends JApplet implements Runnable {
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
        super.paint(g);
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