import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Swing5 extends JFrame {
    JFrame f;
    JLabel lname, lage, lqua, ladd;
    JTextField name, age, qua;
    JTextArea add;

    public void create() {
        f = new JFrame();
        lname = new JLabel("Name- ");
        lage = new JLabel("Age- ");
        lqua = new JLabel("Qualification- ");
        ladd = new JLabel("Address- ");
        name = new JTextField();
        age = new JTextField();
        qua = new JTextField();
        add = new JTextArea();
        lname.setBounds(50, 50, 70, 30);
        name.setBounds(120, 50, 100, 30);
        lage.setBounds(50, 100, 70, 30);
        age.setBounds(120, 100, 100, 30);
        lqua.setBounds(50, 150, 70, 30);
        qua.setBounds(120, 150, 100, 30);
        ladd.setBounds(50, 200, 70, 30);
        add.setBounds(120, 200, 100, 100);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(lname);
        f.add(name);
        f.add(lage);
        f.add(age);
        f.add(lqua);
        f.add(qua);
        f.add(ladd);
        f.add(add);
    }

    public static void main(String[] args) {
        Swing5 ob = new Swing5();
        ob.create();
    }
}