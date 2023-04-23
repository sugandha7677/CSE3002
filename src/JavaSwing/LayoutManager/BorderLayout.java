package JavaSwing.LayoutManager;

import java.awt.Container;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout {
    

    private static final Object NORTH = null;
    private static final Object SOUTH = null;
    private static final Object East = null;

    public static void main (String[] args) {

        JFrame f = new JFrame("Border layout eg");
        f.setBounds(300, 200, 500, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        Panel c = new Panel();
        c.setLayout(new BorderLayout());

        JButton b1 = new JButton("PAGE_START");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");
 
        c.add(b1, BorderLayout.NORTH);
        c.add(b2, BorderLayout.SOUTH);
        c.add(b3,BorderLayout.East );
        c.add(b4);
        c.add(b5);

    }
}
