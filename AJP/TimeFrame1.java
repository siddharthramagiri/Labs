import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import javax.swing.*;

public class TimeFrame1 implements ActionListener {
    JFrame jf = new JFrame();
    JButton b1;
    JLabel l1;

    public TimeFrame1() {
        jf.setTitle("Time Frame");
        jf.setLayout(new FlowLayout());
        l1 = new JLabel("Hello");
        b1 = new JButton("Get Time");

        jf.add(l1);
        jf.add(b1);
        b1.addActionListener(this);
        jf.setSize(500, 500);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Calendar time = Calendar.getInstance();
        String str;
        int hr = time.get(Calendar.HOUR_OF_DAY);
        if (hr < 12)
            str = "GOOD MORNING";
        else if (hr >= 12 && hr <= 16)
            str = "GOOD AFTERNOON";
        else if (hr > 16 && hr <= 20)
            str = "GOOD EVENING";
        else
            str = "GOOD NIGHT";

        l1.setText(str);
    }

    public static void main(String[] args) {
        TimeFrame1 TF = new TimeFrame1();
    }
}