package mytoolkit;

import java.lang.Thread;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

public class ClockFrame extends JFrame {

    private ClockPanel myClockPanel;

    public ClockFrame() {

        myClockPanel = new ClockPanel();

        setLayout(null);
        setTitle("JClock Clock Java App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        getContentPane().setBackground(Color.RED);
        setContentPane(myClockPanel);
        setPreferredSize(new Dimension(350,200));
        setBounds(0,0,350,200);
        setLocationRelativeTo(null);
        setVisible(true);

        while(true) {
            myClockPanel.setTime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
