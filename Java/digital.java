import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class digital extends JFrame {
    private JLabel dateLabel;
    private JLabel timeLabel;

    public digital() {
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana", Font.PLAIN, 32));
        dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 48));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        Timer timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SimpleDateFormat dateFormatter = new SimpleDateFormat("dd-MM-yyyy");
                SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm:ss");
                dateLabel.setText(dateFormatter.format(new Date()));
                timeLabel.setText(timeFormatter.format(new Date()));
            }
        });
        timer.start();
        this.setTitle("Digital Clock");
        this.setLayout(new GridLayout(2, 1)); 
        this.add(dateLabel);
        this.add(timeLabel);
        this.setSize(400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new digital());
    }
}
