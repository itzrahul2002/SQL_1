import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Swing_from {
    public static void main(String[] args) throws FontFormatException {
        JFrame jf = new JFrame("Login Form");
        jf.getContentPane().setBackground(Color.GRAY);
        jf.setResizable(false);
        Border b = BorderFactory.createLineBorder(Color.green);
        LineBorder lb = new LineBorder(Color.green,3,true);


        // label for head
        JLabel l1 = new JLabel("Login Form");
        l1.setBounds(140,40,200,60);
        Font f = new Font("Modern No. 20", Font.ITALIC,30);
        l1.setFont(f);
        l1.setForeground(Color.RED);

        //label fro user name
        JLabel l2 = new JLabel();
        l2.setText("User Name :");
        l2.setFont(f);
        l2.setForeground(Color.BLUE);
        l2.setBounds(40,120,150,50);

        // field for name
        JTextField tf = new JTextField();
        tf.setFont(f);
        tf.setForeground(Color.BLACK);
        tf.setBounds(200,125,200,40);
        tf.setBorder(b);
        tf.setBorder(lb);

        //label for Password
        JLabel l3 = new JLabel();
        l3.setText("Password :");
        l3.setFont(f);
        l3.setForeground(Color.BLUE);
        l3.setBounds(40,190,150,50);

        // filed for password
        JPasswordField jp = new JPasswordField();
        jp.setFont(f);
        jp.setForeground(Color.BLACK);
        jp.setBounds(200,195,200,40);
        jp.setBorder(b);
        jp.setBorder(lb);

        // for button
        JButton jb = new JButton();
        jb.setText("Login");
        jb.setFont(f);
        jb.setForeground(Color.BLACK);
        jb.setBounds(140,280,150,40);
        jb.setBorder(b);
        jb.setBorder(lb);


        jf.add(l1);jf.add(l2);jf.add(tf);jf.add(l3);jf.add(jp);jf.add(jb);
        jf.setSize(500,500);
        jf.setLayout(null);
        jf.setVisible(true);
    }
}
