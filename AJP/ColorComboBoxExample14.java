import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorComboBoxExample14 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Color Selector");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        // Define color options
        String[] colors = { "Red", "Green", "Blue", "Yellow", "Orange" };
        // Create a combo box with color options
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        frame.add(colorComboBox);
        // Add an action listener to handle color selection
        colorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected color from combo box
                String selectedColor = (String) colorComboBox.getSelectedItem();
                // Change frame background color based on selection
                switch (selectedColor) {
                    case "Red":
                        frame.getContentPane().setBackground(Color.RED);
                        break;
                    case "Green":
                        frame.getContentPane().setBackground(Color.GREEN);
                        break;
                    case "Blue":
                        frame.getContentPane().setBackground(Color.BLUE);
                        break;
                    case "Yellow":
                        frame.getContentPane().setBackground(Color.YELLOW);
                        break;
                    case "Orange":
                        frame.getContentPane().setBackground(Color.ORANGE);
                        break;
                    default:
                        frame.getContentPane().setBackground(Color.WHITE);
                        break;
                }
            }
        });
        // Make the frame visible
        frame.setVisible(true);
    }
}