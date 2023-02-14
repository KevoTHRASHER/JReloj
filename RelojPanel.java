package mytoolkit;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.lang.Thread;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ClockPanel extends JPanel {

    private JLabel timeLabel, dayLabel, dateLabel;
    private LocalTime tiempoAhoraLocalTime;
    private LocalDate diaLocalDate, fechaLocalDate;
    private DateTimeFormatter tiempoAhoraDateTimeFormatter, diaLocalDateTimeFormatter, fechaLocalDateTimeFormatter;
    private String tiempoAhoraString, diaString, fechaString;

    public ClockPanel() {

        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(350,200));
        this.setBounds(0,0,350,200);
        this.setBackground(Color.BLACK);

        tiempoAhoraDateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        diaLocalDateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
        fechaLocalDateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, y");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("JetBrains Mono",Font.BOLD,50));
        timeLabel.setBackground(new Color(95,42,98));
        timeLabel.setForeground(Color.GREEN);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("JetBrains Mono",Font.PLAIN,35));
        dayLabel.setBackground(new Color(118,88,152));
        dayLabel.setForeground(Color.GREEN);
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("JetBrains Mono",Font.PLAIN,25));
        dateLabel.setBackground(new Color(169,118,195));
        dateLabel.setForeground(Color.GREEN);
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
    }

    public void setTime() {
        tiempoAhoraLocalTime = LocalTime.now();
        tiempoAhoraString = tiempoAhoraDateTimeFormatter.format(tiempoAhoraLocalTime);
        timeLabel.setText(tiempoAhoraString);

        diaLocalDate = LocalDate.now();
        diaString = diaLocalDateTimeFormatter.format(diaLocalDate);
        dayLabel.setText(diaString);

        fechaLocalDate = LocalDate.now();
        fechaString = fechaLocalDateTimeFormatter.format(fechaLocalDate);
        dateLabel.setText(fechaString);

    }
}
