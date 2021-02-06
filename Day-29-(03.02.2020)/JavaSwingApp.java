import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaSwingApp {

    public static void main(String[] args) {
        JFrame f = new JFrame("JButton Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Hello World");
        f.add(l);
        f.setSize(200, 200);
        f.setVisible(true);
    }

}
