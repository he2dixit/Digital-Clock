import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class digital extends JFrame {
    private JLabel timeLabel;

    public digital() {
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                timeLabel.setText(formatter.format(new Date()));
            }
        });
        timer.start();
      
        this.setTitle("Digital Clock");
        this.add(timeLabel);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new digital();
    }
}
