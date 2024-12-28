import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_event_listner extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField jtf;
    JButton jb;
    Swing_event_listner(){
        l1 = new JLabel();
        l1.setBounds(100, 100, 200, 50);

        jtf = new JTextField();
        jtf.setBounds(100,150,150,40);

        jb = new JButton("SUBMIT");
        jb.setBounds(140,200,150,40);
        jb.addActionListener(this);

        add(l1);add(jtf);add(jb);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Swing_event_listner();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String result = jtf.getText();
        l1.setText(result);
    }
}
