package school_magement_app;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AdminPanel extends JPanel{
    JLabel testLbl;
    
    //Constructor 
    public AdminPanel() {
        this.setBounds(0, 0, Settings.WIDTH, Settings.HEIGHT);
        this.setBackground(Color.CYAN);
        this.setVisible(true);

        testLbl = new JLabel("Hello");
        this.add(testLbl);
    }
}
