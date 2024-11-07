import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArthimeticMenuBar11 {
    JFrame f;
    JMenuBar mb;
    JMenu m1;
    JMenuItem i1, i2, i3, i4;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    ArthimeticMenuBar11() {
        f = new JFrame("MenuBar Example");
        f.setLayout(new FlowLayout());
        f.setSize(400, 300);
        l1 = new JLabel("Number1");
        l2 = new JLabel("Number2");
        l3 = new JLabel("Result");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        mb = new JMenuBar();
        m1 = new JMenu("Arithmetic");
        i1 = new JMenuItem("Addition");
        i2 = new JMenuItem("Subtraction");
        i3 = new JMenuItem("Multiply");
        i4 = new JMenuItem("Division");
        i1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("add");
            }
        });

        i2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("subtract");
            }
        });
        i3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("multiply");
            }
        });

        i4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation("divide");
            }
        });
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        mb.add(m1);
        f.setJMenuBar(mb);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    private void performOperation(String operation) {
        try {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());
            int result = 0;
            switch (operation) {
                case "add":
                    result = num1 + num2;
                    break;
                case "subtract":
                    result = num1 - num2;
                    break;
                case "multiply":
                    result = num1 * num2;
                    break;
                case "divide":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        t3.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }
            t3.setText("" + result);
        } catch (NumberFormatException e) {
            t3.setText("Error: Invalid number");
        }
    }

    public static void main(String args[]) {
        new ArthimeticMenuBar11();
    }
}