import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing4 extends JFrame implements ActionListener {
    JFrame f;
    JLabel lname, lstreet, lcity, lpin;
    JTextField name, street, city, pin;
    JTextArea display;
    JButton b;

    public void create() {
        f = new JFrame();
        lname = new JLabel("Name- ");
        lname.setBounds(50, 50, 50, 30);
        name = new JTextField();
        name.setBounds(100, 50, 100, 30);
        lstreet = new JLabel("Street- ");
        street = new JTextField();
        lstreet.setBounds(50, 100, 50, 30);
        street.setBounds(100, 100, 100, 30);
        lcity = new JLabel("City- ");
        city = new JTextField();
        lcity.setBounds(50, 150, 50, 30);
        city.setBounds(100, 150, 100, 30);
        lpin = new JLabel("Pincode- ");
        pin = new JTextField();
        lpin.setBounds(50, 200, 50, 30);
        pin.setBounds(100, 200, 100, 30);
        b = new JButton("MyDetails");
        b.addActionListener(this);
        b.setBounds(120, 250, 200, 30);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500, 600);
        f.add(lname);
        f.add(name);
        f.add(lstreet);
        f.add(street);
        f.add(lcity);
        f.add(city);
        f.add(lpin);
        f.add(pin);
        f.add(b);
        display = new JTextArea();
        display.setBounds(50, 300, 200, 70);
        f.add(display);
    }

    public void actionPerformed(ActionEvent e) {
        Font fo = new Font("Arial", Font.ITALIC, 30);
        f.setFont(fo);
        String str = "Name- " + name.getText() + "\nStreet- " + street.getText() + "\nCity- " + city.getText()
                + "\nPincode- " + pin.getText();
        display.setText(str);
    }

    public static void main(String[] args) {
        Swing4 ob = new Swing4();
        ob.create();
    }
}