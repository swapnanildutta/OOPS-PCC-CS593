import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* <applet code="SwingTest.class" width="400" height="350"></applet>  */

public class SwingTest extends JApplet implements ActionListener {
    JButton b;
    JTextField tf;

    @Override
    public void init() {
        tf = new JTextField();
        tf.setBounds(30, 40, 150, 20);
        b = new JButton("Click");
        b.setBounds(80, 150, 70, 40);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }

}