import java.awt.event.*;
import javax.swing.*;

public class WindowAdapterExample8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Adapter Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        JLabel label = new JLabel("Perform a window action to see events", SwingConstants.CENTER);
        frame.add(label);
        frame.addWindowListener(new WindowAdapter() {
            public void windowOpened(WindowEvent e) {
                label.setText("Window opened");
                System.out.println("Window opened");
            }

            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showConfirmDialog(frame, "Are you sure you want toclose this window?",
                        "Close Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.out.println("Window closed by user.");
                    frame.dispose();
                }
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed.");
            }

            public void windowIconified(WindowEvent e) {
                label.setText("Window minimized");
                System.out.println("Window minimized");
            }

            public void windowDeiconified(WindowEvent e) {
                label.setText("Window restored");
                System.out.println("Window restored");
            }
        });
        frame.setVisible(true);
    }
}