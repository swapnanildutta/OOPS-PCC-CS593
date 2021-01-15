package testing2021;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MyEventHandler extends Applet implements ActionListener {
    TextField t;
    Button b1, b2, b3;

    @Override
    public void init() {
        setBackground(Color.gray);
        t = new TextField(30);
        add(t);
        b1 = new Button("OOP");
        add(b1);
        b2 = new Button("JAVA");
        add(b2);
        b3 = new Button("UML");
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1)
            t.setText("OOP");
        else if(e.getSource() == b2)
            t.setText("JAVA");
        else
            t.setText("UML");
    }
    
}
