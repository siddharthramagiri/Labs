import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class FileChooserEx12 extends JFrame implements ActionListener {
    private JButton b1, b2;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    private JFileChooser fileChooser;

    public FileChooserEx12() {
        setTitle("File Chooser Example");
        b1 = new JButton("Open File");
        b2 = new JButton("Clear Text");
        textArea = new JTextArea("", 20, 40);
        scrollPane = new JScrollPane(textArea);
        fileChooser = new JFileChooser();
        b1.addActionListener(this);
        b2.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(b1);
        panel.add(b2);
        add(panel, "North");
        add(scrollPane, "Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                String filePath = selectedFile.getAbsolutePath();
                String line;
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                    textArea.setText("");
                    while ((line = reader.readLine()) != null) {
                        textArea.append(line + "\n");
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == b2) {
            textArea.setText("");
        }
    }

    public static void main(String[] args) {
        new FileChooserEx12();
    }
}