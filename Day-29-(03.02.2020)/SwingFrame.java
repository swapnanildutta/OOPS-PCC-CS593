import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingFrame extends JFrame implements ActionListener {
    JFrame f;
    JButton b;
    JTextField t;

    public void create() {
        f = new JFrame();
        b = new JButton("Click Me");
        b.setBounds(80, 150, 70, 40);
        t = new JTextField();
        t.setBounds(30, 40, 150, 20);
        b.addActionListener(this);
        f.setSize(500, 600);
        f.setLayout(null);
        f.add(b);
        f.add(t);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        t.setText("Welcome");
    }

    public static void main(String[] args) {
        SwingFrame ob = new SwingFrame();
        ob.create();
    }
}