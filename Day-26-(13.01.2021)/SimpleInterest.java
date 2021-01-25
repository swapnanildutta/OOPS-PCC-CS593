import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SimpleInterest extends Applet implements ActionListener {
    TextField t1, t2, t3, t4;
    Label l1, l2, l3, l4;
    Button b;

    @Override
    public void init() {
        setBackground(Color.gray);
        l1 = new Label("Principal");
        t1 = new TextField(10);
        add(l1); add(t1);
        l2 = new Label("Time");
        t2 = new TextField(10);
        add(l2); add(t2);
        l3 = new Label("Rate");
        t3 = new TextField(10);
        add(l3); add(t3);
        b = new Button("Calculate Interest");
        add(b);
        l4 = new Label("Simple Interest");
        t4 = new TextField(10);
        add(l4); add(t4);        
        b.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        Double P = Double.parseDouble(s1);
        String s2 = t2.getText();
        Double T = Double.parseDouble(s2);
        String s3 = t3.getText();
        Double R = Double.parseDouble(s3);
        //Simple interest calculation
        Double SI = (P*T*R)/100.0;
        t4.setText(SI.toString());
    }
    
}

