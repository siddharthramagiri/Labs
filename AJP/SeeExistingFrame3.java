import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SeeExistingFrame3 extends JFrame {
    JButton b1;

    SeeExistingFrame3() {
        setSize(500, 500);
        setLayout(new FlowLayout());
        b1 = new JButton("Click me");
        add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Arthmetic2 a = new Arthmetic2();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        new SeeExistingFrame3();
    }
}