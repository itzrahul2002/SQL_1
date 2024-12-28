import javax.swing.*;

public class Swing2 {
    JFrame jf;
    Swing2(){
        jf = new JFrame("Example Swing Association");
        JTextField tf = new JTextField();
        tf.setBounds(100, 100, 130, 30);

        JButton jb = new JButton("Click Button !");
        jb.setBounds(100, 160, 100, 30);

        jf.add(jb);jf.add(tf);

        jf.setSize(400,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
    public static void main(String[] args) {
       new  Swing2();
    }
}
