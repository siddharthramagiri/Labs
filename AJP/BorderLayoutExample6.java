import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        JButton button1 = new JButton("Button1");
        ImageIcon buttonIcon = new ImageIcon("path/to/your/image.png");
        JButton imageButton = new JButton(buttonIcon);
        ImageIcon labelIcon = new ImageIcon("path/to/your/image.png");
        JLabel imageLabel = new JLabel(labelIcon);
        JTextField textField = new JTextField("Welcome");
        JToggleButton toggleButton = new JToggleButton("TButton");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(imageButton, BorderLayout.SOUTH);
        frame.add(imageLabel, BorderLayout.WEST);
        frame.add(textField, BorderLayout.CENTER);
        frame.add(toggleButton, BorderLayout.EAST);

        frame.setVisible(true);
    }
}
