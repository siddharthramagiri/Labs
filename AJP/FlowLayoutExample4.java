import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow LayoutExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button1");
        ImageIcon buttonIcon = new ImageIcon("yourimage path.png"); // Replace with your image path
        JButton imageButton = new JButton(buttonIcon);
        ImageIcon labelIcon = new ImageIcon("yourimage path.png");
        JLabel imageLabel = new JLabel(labelIcon);
        JTextField textField = new JTextField("Welcome", 15);
        JToggleButton toggleButton = new JToggleButton("TButton");
        frame.add(button1);
        frame.add(imageButton);
        frame.add(imageLabel);
        frame.add(textField);
        frame.add(toggleButton);
        frame.setVisible(true);
    }
}
