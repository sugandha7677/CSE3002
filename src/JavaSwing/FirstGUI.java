package JavaSwing;

//import java.awt.FlowLayout;
import java.awt.*;

// import javax.swing.JFrame;
// import javax.swing.JLabel;


public class FirstGUI {
    public static void main(String [] args) {
        
        Abc obj = new Abc();
        
    }
}

class Abc extends Frame { // cardLayout -- stack of card can see only top card

    // constructor
    public Abc () {

        
        Label l = new Label("Hello World");
        Label l1 = new Label("welcome navin");
        add(l);
        add(l1);  // overridden l
        // to solve need to change layout

        // 4 lines need to be same for all codes
        
        setLayout(new FlowLayout()); // FlowLayout -- middle area of frame
        // GridLayout
        // Null
        setVisible(true);
        setSize(400, 400);

        // to close 
        //setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
    }
}
