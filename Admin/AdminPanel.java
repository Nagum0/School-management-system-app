package App.Admin;

import javax.swing.JButton;
import javax.swing.JPanel;

import App.Settings;

//Menu for admin
public class AdminPanel extends JPanel{
    //Menu buttons
    JButton openAddStudent;
    
    //Constructor 
    public AdminPanel() {
        this.setBounds(0, 0, Settings.WIDTH, Settings.HEIGHT);
        this.setLayout(null);
        this.setVisible(true);

        //Open add student frame
        openAddStudent = new JButton("Add student");
        openAddStudent.setFocusable(false);
        openAddStudent.setBounds(0, 0, Settings.MENU_BTN_WIDTH, Settings.MENU_BTN_HEIGHT);

        //Adding the widgets
        this.add(openAddStudent);
    }
}
