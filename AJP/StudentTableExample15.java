import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentTableExample15 {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Student Table");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        // Define column names
        String[] columns = { "Roll No", "Name", "Branch" };
        // Define data for rows
        Object[][] data = {
                { 1, "ABC", "CSM" }, { 2, "PQR", "CSD" }, { 3, "XYZ", "CSN" }
        };
        // Create a table model and set it to JTable
        DefaultTableModel tableModel = new DefaultTableModel(data, columns);
        JTable table = new JTable(tableModel);
        // Add table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        // Make the frame visible
        frame.setVisible(true);
    }
}