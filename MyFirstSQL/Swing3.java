import javax.swing.*;

public class Swing3  extends JFrame {
     Swing3()
     {
         setTitle("Example Swing Inheritance");
         JTextField tf = new JTextField();
         tf.setBounds(100,100,120,30);

         JButton jb = new JButton("SUBMIT");
         jb.setBounds(150,150,120,50);
         add(jb);add(tf);
         setSize(500,500);
         setLayout(null);
         setVisible(true);

     }

    public static void main(String[] args) {
        new Swing3();
    }
}
