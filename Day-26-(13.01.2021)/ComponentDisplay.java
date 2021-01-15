/* <applet code="ComponentDisplay.class" width=400 height=500></applet> */

import java.awt.*;
import java.applet.*;

public class ComponentDisplay extends Applet {

    public void init() {
        setLayout(new BorderLayout());
        Panel p;
        p = new Panel();
        p.setLayout(new GridLayout(0, 2));
        p.add(new Label("Button"));
        p.add(new Button("Press Me"));
        p.add(new Label("Checkbox"));
        p.add(new Checkbox("Check Me"));
        p.add(new Label("Choice"));
        Choice c = new Choice();
        c.addItem("Make");
        c.addItem("A");
        c.addItem("Choice");
        p.add(c);
        p.add(new Label("Label"));
        p.add(new Label("This is a Label"));
        p.add(new Label("Scrollbar"));
        p.add(new Scrollbar(Scrollbar.HORIZONTAL));
        p.add(new Label("TextField"));
        p.add(new TextField("Type Here"));
        add("North", p);
        p = new Panel();
        p.setLayout(new GridLayout(0, 2));
        p.add(new Label("Canvas"));
        p.add(new Canvas());
        p.add(new Label("List"));
        List l = new List();
        l.addItem("A");
        l.addItem("List");
        p.add(l);
        p.add(new Label("TextArea"));
        p.add(new TextArea());
        add("Center", p);
    }

    public static void main(String[] args) {
        Frame f = new Frame("Component Display");
        ComponentDisplay ex = new ComponentDisplay();
        ex.init();
        f.add("Center", ex);
        f.pack();
        f.show();
    }
}
