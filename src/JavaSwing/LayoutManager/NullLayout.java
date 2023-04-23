package JavaSwing.LayoutManager;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayout {
    public static void main (String[] args) {
        JFrame f = new JFrame("Null layout eg");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        Container c = f.getContentPane();
        c.setLayout(null);

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");

        b1.setBounds(20, 20, 80, 030);
        b2.setBounds(120, 20, 80, 030);
        b3.setBounds(220, 20, 80, 030);
        b4.setBounds(20, 100, 80, 030);
        b5.setBounds(120, 100, 80, 30);
        
        c.add(b1);
        c.add(b2);
        c.add(b3);
        c.add(b4);
        c.add(b5);
    }
}
