import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Arthmetic2 extends JFrame implements ActionListener {
    JButton b1, b2, b3, b4;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    public Arthmetic2() {
        setLayout(new FlowLayout());
        b1 = new JButton("ADD");
        b2 = new JButton("SUB");
        b3 = new JButton("MUL");
        b4 = new JButton("DIV");
        l1 = new JLabel("Number1");
        l2 = new JLabel("Number2");
        l3 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int n1 = Integer.parseInt(t1.getText());
        int n2 = Integer.parseInt(t2.getText());
        double n3;
        String action = e.getActionCommand();
        if (action.equals("ADD")) {
            n3 = n1 + n2;
        } else if (action.equals("SUB")) {
            n3 = n1 - n2;
        } else if (action.equals("MUL")) {
            n3 = n1 * n2;
        } else {
            n3 = (double) n1 / (double) n2;
        }
        t3.setText(n3 + "");
    }

    public static void main(String[] args) {
        Arthmetic2 Ar = new Arthmetic2();
    }
}
