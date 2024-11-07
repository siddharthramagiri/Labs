import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SaveTextFileExample13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Save Text File");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); // Add scroll pane for large text
        frame.add(scrollPane, BorderLayout.CENTER);
        JButton saveButton = new JButton("Save File");
        frame.add(saveButton, BorderLayout.SOUTH);
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a JFileChooser for saving files
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Save Text File");
                int result = fileChooser.showSaveDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File fileToSave = fileChooser.getSelectedFile();
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave))) {
                        writer.write(textArea.getText());
                        JOptionPane.showMessageDialog(frame, "File saved successfully!", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage(), "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        frame.setVisible(true);
    }
}
