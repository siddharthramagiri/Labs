
import javax.swing.*;

public class SimpleMenuExample9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Menu Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Options");
        JMenuItem item1 = new JMenuItem("Item 1");
        JMenuItem item2 = new JMenuItem("Item 2");
        JMenuItem item3 = new JMenuItem("Item 3");
        menu.add(item1);
        menu.add(item2);
        menu.add(item3);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}