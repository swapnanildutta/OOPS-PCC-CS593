import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JApplet implements ActionListener {
    String currInput = "0", operator = "", firstNum = "0";
    JTextField display;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, eq, cls, bspa, bp;

    public void init() {
        setBackground(Color.gray);
        display = new JTextField(12);
        display.setBackground(Color.white);
        display.setBounds(50, 0, 200, 50);
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bp = new JButton(".");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        eq = new JButton("=");
        cls = new JButton("C");
        bspa = new JButton("BackSpace");
        b7.setBounds(50, 50, 50, 20);
        b8.setBounds(100, 50, 50, 20);
        b9.setBounds(150, 50, 50, 20);
        sub.setBounds(200, 50, 50, 20);
        b4.setBounds(50, 70, 50, 20);
        b5.setBounds(100, 70, 50, 20);
        b6.setBounds(150, 70, 50, 20);
        add.setBounds(200, 70, 50, 20);
        b1.setBounds(50, 90, 50, 20);
        b2.setBounds(100, 90, 50, 20);
        b3.setBounds(150, 90, 50, 20);
        mul.setBounds(200, 90, 50, 20);
        bp.setBounds(50, 110, 50, 20);
        b0.setBounds(100, 110, 50, 20);
        div.setBounds(150, 110, 50, 20);
        eq.setBounds(200, 110, 50, 20);
        bspa.setBounds(50, 130, 100, 20);
        cls.setBounds(150, 130, 100, 20);
        add(display);
        add(b7);
        add(b8);
        add(b9);
        add(sub);
        add(b4);
        add(b5);
        add(b6);
        add(add);
        add(b1);
        add(b2);
        add(b3);
        add(mul);
        add(bp);
        add(b0);
        add(cls);
        add(div);
        add(eq);
        add(bspa);
        setLayout(null);
        display.setText("0");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eq.addActionListener(this);
        bspa.addActionListener(this);
        bp.addActionListener(this);
        cls.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        JButton target = (JButton) e.getSource();
        if (e.getSource() == cls) {
            currInput = "0";
        } else if (target == b1 || target == b2 || target == b3 || target == b4 || target == b5 || target == b6
                || target == b7 || target == b8 || target == b9 || target == b0 || target == bp) {
            if (currInput == "0") {
                currInput = target.getLabel();
            } else {
                currInput += target.getLabel();
            }
        } else if (target == bspa) {
            if (currInput.length() == 1) {
                currInput = "0";
            } else {
                currInput = currInput.substring(0, currInput.length() - 1);
            }
        } else if (target == add || target == sub || target == mul || target == div) {
            operator = target.getLabel();
            firstNum = currInput;
            currInput = "0";
        } else if (target == eq) {
            Double a, b;
            a = Double.parseDouble(firstNum);
            b = Double.parseDouble(currInput);
            if (operator == "+") {
                a = a + b;
                currInput = a.toString();
                operator = "";
            } else if (operator == "-") {
                a = a - b;
                currInput = a.toString();
                operator = "";
            } else if (operator == "*") {
                a = a * b;
                currInput = a.toString();
                operator = "";
            } else if (operator == "/") {
                a = a / b;
                currInput = a.toString();
                operator = "";
            }
        }
        display.setText(currInput);
    }
}