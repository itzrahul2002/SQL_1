package DemoAwt;

import java.awt.*;

public class DemoAwt {
    public static void main(String[] args) {
        Frame f = new Frame();
        Button b = new Button("Click me !");
        b.setBounds(100,100,80,50);
        f.add(b);

        f.setSize(300,400);
        f.setLayout(null);

        f.setSize(300,400);
        f.setVisible(true);
    }
}
