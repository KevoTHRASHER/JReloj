package mytoolkit;

import java.lang.Thread;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.FlowLayout;

public class RelojFrame extends JFrame {

    private RelojPanel myRelojPanel;

    public RelojFrame() {

        myRelojPanel = new RelojPanel();

        setLayout(null);
        setTitle("JClock Reloj Java App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        getContentPane().setBackground(Color.RED);
        setContentPane(myRelojPanel);
        setPreferredSize(new Dimension(350,200));
        setBounds(0,0,350,200);
        setLocationRelativeTo(null);
        setVisible(true);

        while(true) {
            myRelojPanel.setTime();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
