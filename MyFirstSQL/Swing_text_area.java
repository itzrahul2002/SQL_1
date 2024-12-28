import javax.swing.*;

public class Swing_text_area {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JTextArea jta = new JTextArea();
        jta.setBounds(10,30,200,300);
        jf.add(jta);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}