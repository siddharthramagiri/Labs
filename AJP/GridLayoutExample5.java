import java.awt.*;
import javax.swing.*;

public class GridLayoutExample5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(2, 3));
        JButton button1 = new JButton("Button1");
        ImageIcon buttonIcon = new ImageIcon("path/to/your/image.png");
        JButton imageButton = new JButton(buttonIcon);
        ImageIcon labelIcon = new ImageIcon("path/to/your/image.png");
        JLabel imageLabel = new JLabel(labelIcon);
        JTextField textField = new JTextField("Welcome");
        JToggleButton toggleButton = new JToggleButton("TButton");
        frame.add(button1);
        frame.add(imageButton);
        frame.add(imageLabel);
        frame.add(textField);
        frame.add(toggleButton);

        // Add an empty label to fill the remaining cell
        frame.add(new JLabel());
        // Make the frame visible
        frame.setVisible(true);

    }
}
