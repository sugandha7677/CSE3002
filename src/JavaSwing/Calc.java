package JavaSwing;

import java.awt.FlowLayout;

import javax.swing.*;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;

public class Calc {
    public static void main(String[] args) {
        AddSub obj = new AddSub();
    }
}

class AddSub extends JFrame{

    JTextField t1, t2;

    JButton b1, b2, b3;
    JLabel l;

    public AddSub() {

        t1 = new JTextField(15);
        t2 = new JTextField(15);
        b1 = new JButton("add");
        b2 = new JButton("Sub");
        b3 = new JButton("Quit");
        l = new JLabel("Result");

        
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(l);

        b1.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int val = n1 + n2;

            l.setText(val + "");
        });

        b2.addActionListener(e -> {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int val = n1 - n2;

            l.setText(val + "");
        });

        //b3.addActionListener();

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
