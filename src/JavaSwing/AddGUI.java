package JavaSwing;

import java.awt.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AddGUI {
    public static void main(String[] args) {
        // Addition obj = new Addition();
        Addition1 obj = new Addition1();
    }

}

// A1 using implementing interface of action listener
class Addition extends JFrame implements ActionListener {
    JTextField t1, t2;
    JButton b;
    JLabel l;

    public Addition() {

        t1 = new JTextField(20); // to take input textfield
        t2 = new JTextField(20);

        b = new JButton("OK");

        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this); // ActionListener is an interface

        setLayout(new FlowLayout()); // FlowLayout -- middle area of frame
        // GridLayout
        // Null
        setVisible(true);
        setSize(400, 400);

        // to close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        int val = n1 + n2;

        l.setText(val + "");
    }
}

// A2. using anonymous class of ActionListener

class Addition1 extends JFrame {
    JTextField t1, t2;
    JButton b;
    JLabel l;

    public Addition1() {

        t1 = new JTextField(20); // to take input textfield
        t2 = new JTextField(20);

        b = new JButton("OK");

        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        ActionListener a1 = new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                int n1 = Integer.parseInt(t1.getText());
                int n2 = Integer.parseInt(t2.getText());
                int val = n1 + n2;

                l.setText(val + "");
            }
        };

        b.addActionListener(a1); // ActionListener is an interface

        setLayout(new FlowLayout()); // FlowLayout -- middle area of frame
        // GridLayout
        // Null
        setVisible(true);
        setSize(400, 400);

        // to close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}