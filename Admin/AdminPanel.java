package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import App.Main;
import App.Settings;

//Class for buttons that open admin frames----------------------------------------------------------------------
class AddBtn extends JButton implements ActionListener {
    String openNewWindow;

    //Constructor
    public AddBtn(String text, int x, int y, String openNewWindow) {
        this.openNewWindow = openNewWindow;

        this.setText(text);
        this.setBounds(x, y, Settings.MENU_BTN_WIDTH, Settings.MENU_BTN_HEIGHT);
        this.setFocusable(false);
        this.addActionListener(this);
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this) {
            //Switch for opening new admin frames
            switch (openNewWindow) {
                //Open student frame
                case "add_student_frame":
                    Settings.nextPanel = "add_student";
                    break;
                //Open teacher frame
                case "add_teacher_frame":
                    Settings.nextPanel = "add_teacher";
                    break;
            }

            //Change panel method called
            Main.changePanel();
        }
    }
}

//Main ADMIN PANEL class----------------------------------------------------------------------------------------
//Menu for admin
public class AdminPanel extends JPanel{
    //Menu buttons
    AddBtn openAddStudentBtn;
    AddBtn openAddTeacherBtn;
    
    //Constructor 
    public AdminPanel() {
        this.setBounds(0, 0, Settings.WIDTH, Settings.HEIGHT);
        this.setLayout(null);
        this.setVisible(true);

        openAddStudentBtn = new AddBtn("Add student", 170, 125, "add_student_frame");
        openAddTeacherBtn = new AddBtn("Add teacher", 470, 125, "add_teacher_frame");

        //Adding the widgets
        this.add(openAddStudentBtn);
        this.add(openAddTeacherBtn);
    }
}