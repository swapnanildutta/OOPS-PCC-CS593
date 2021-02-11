import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame implements ActionListener {
    JFrame f;
    JButton red, green, blue, yellow, black, gray;

    public void create() {
        f = new JFrame();
        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");
        yellow = new JButton("Yellow");
        black = new JButton("Black");
        gray = new JButton("Gray");
        red.setBounds(50, 50, 100, 40);
        green.setBounds(50, 90, 100, 40);
        blue.setBounds(50, 130, 100, 40);
        yellow.setBounds(50, 170, 100, 40);
        black.setBounds(50, 210, 100, 40);
        gray.setBounds(50, 250, 100, 40);
        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
        yellow.addActionListener(this);
        black.addActionListener(this);
        gray.addActionListener(this);
        f.setSize(500, 600);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.add(red);
        f.add(green);
        f.add(blue);
        f.add(yellow);
        f.add(black);
        f.add(gray);
    }

    public void actionPerformed(ActionEvent e) {
        JButton target = (JButton) e.getSource();
        if (target == red) {
            f.getContentPane().setBackground(Color.RED);
        }
        if (target == green) {
            f.getContentPane().setBackground(Color.GREEN);
        }
        if (target == blue) {
            f.getContentPane().setBackground(Color.BLUE);
        }
        if (target == yellow) {
            f.getContentPane().setBackground(Color.YELLOW);
        }
        if (target == black) {
            f.getContentPane().setBackground(Color.BLACK);
        }
        if (target == gray) {
            f.getContentPane().setBackground(Color.GRAY);
        }
    }

    public static void main(String[] args) {
        ColorFrame ob = new ColorFrame();
        ob.create();
    }
}