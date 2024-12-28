import javax.swing.*;

public class Swing_checkbox {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JCheckBox jc = new JCheckBox("JAVA");
        jc.setBounds(100,100,100,50);
        JCheckBox jc2 = new JCheckBox("C++");
        jc2.setBounds(100,150,50,50);

        jf.add(jc);
        jf.add(jc2);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
