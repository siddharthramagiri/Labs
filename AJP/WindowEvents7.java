import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class WindowEvents7 {
    WindowEvents7() {
        JFrame jfrm = new JFrame("Mouse Events");
        jfrm.setSize(400, 300);
        jfrm.setLayout(new FlowLayout());
        jfrm.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                jfrm.setTitle("windowOpened");
            }

            public void windowClosing(WindowEvent e) {
                jfrm.setTitle("windowClosing");
            }

            public void windowClosed(WindowEvent e) {
                jfrm.setTitle("windowClosedd");
            }

            public void windowIconified(WindowEvent e) {
                jfrm.setTitle("windowIconified");
            }

            public void windowDeiconified(WindowEvent e) {
                jfrm.setTitle("windowDeiconified");
            }

            public void windowActivated(WindowEvent e) {
                jfrm.setTitle("windowActivated");
            }

            public void windowDeactivated(WindowEvent e) {
                jfrm.setTitle("windowDeactivated");
            }
        });
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        new WindowEvents7();
    }
}