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

public class RelojPanel extends JPanel {

    private JLabel tiempoLabel, diaLabel, fechaLabel;
    private LocalTime tiempoAhoraLocalTime;
    private LocalDate diaLocalDate, fechaLocalDate;
    private DateTimeFormatter tiempoAhoraDateTimeFormatter, diaLocalDateTimeFormatter, fechaLocalDateTimeFormatter;
    private String tiempoAhoraString, diaString, fechaString;

    public RelojPanel() {

        this.setLayout(new FlowLayout());
        this.setPreferredSize(new Dimension(350,200));
        this.setBounds(0,0,350,200);
        this.setBackground(Color.BLACK);

        tiempoAhoraDateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        diaLocalDateTimeFormatter = DateTimeFormatter.ofPattern("EEEE");
        fechaLocalDateTimeFormatter = DateTimeFormatter.ofPattern("MMMM d, y");

        tiempoLabel = new JLabel();
        tiempoLabel.setFont(new Font("JetBrains Mono",Font.BOLD,50));
        tiempoLabel.setBackground(new Color(95,42,98));
        tiempoLabel.setForeground(Color.GREEN);
        tiempoLabel.setOpaque(true);

        diaLabel = new JLabel();
        diaLabel.setFont(new Font("JetBrains Mono",Font.PLAIN,35));
        diaLabel.setBackground(new Color(118,88,152));
        diaLabel.setForeground(Color.GREEN);
        diaLabel.setOpaque(true);

        fechaLabel = new JLabel();
        fechaLabel.setFont(new Font("JetBrains Mono",Font.PLAIN,25));
        fechaLabel.setBackground(new Color(169,118,195));
        fechaLabel.setForeground(Color.GREEN);
        fechaLabel.setOpaque(true);

        this.add(tiempoLabel);
        this.add(diaLabel);
        this.add(fechaLabel);
        this.setVisible(true);
    }

    public void setTime() {
        tiempoAhoraLocalTime = LocalTime.now();
        tiempoAhoraString = tiempoAhoraDateTimeFormatter.format(tiempoAhoraLocalTime);
        tiempoLabel.setText(tiempoAhoraString);

        diaLocalDate = LocalDate.now();
        diaString = diaLocalDateTimeFormatter.format(diaLocalDate);
        diaLabel.setText(diaString);

        fechaLocalDate = LocalDate.now();
        fechaString = fechaLocalDateTimeFormatter.format(fechaLocalDate);
        fechaLabel.setText(fechaString);

    }
}
