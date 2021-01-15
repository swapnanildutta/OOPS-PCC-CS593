import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Applet implements ActionListener {
    String currInput = "0", operator = "", firstNum = "0";
    TextField display;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, add, sub, mul, div, eq, cls, bspa, bp;

    public void init() {
        setBackground(Color.gray);
        display = new TextField(12);
        display.setBackground(Color.white);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b0 = new Button("0");
        bp = new Button(".");
        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");
        eq = new Button("=");
        cls = new Button("C");
        bspa = new Button("BackSpace");
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
        Button target = (Button) e.getSource();
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