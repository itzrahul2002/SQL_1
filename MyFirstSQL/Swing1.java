import javax.swing.*;

public class Swing1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Swing Frame");
        JButton jb = new JButton("Click Me");
        jb.setBounds(120,120,80,30);
        jf.add(jb);


        jf.setSize(400, 400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
