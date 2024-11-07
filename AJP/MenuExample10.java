
import javax.swing.*;

public class MenuExample10 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        // Create a text area to display the selected menu item
        JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 100, 300, 100);
        frame.add(textArea);
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        // Create a menu
        JMenu menu = new JMenu("Options");
        // Create menu items
        JMenuItem item1 = new JMenuItem("Item 1");

        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");
        // Add action listeners to menu items to display their name in the text area
        item1.addActionListener(e -> textArea.setText("Item 1 selected"));
        item2.addActionListener(e -> textArea.setText("Item 2 selected"));
        item3.addActionListener(e -> textArea.setText("Item 3 selected"));
        // Add menu items to the menu
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        // Add the menu to the menu bar
        menuBar.add(menu);
        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);
        // Make the frame visible
        frame.setVisible(true);
    }
}