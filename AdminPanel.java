package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import App.Settings;

class AddBtn extends JButton{

    //Constructor
    public AddBtn(String text, int x, int y) {
        this.addActionListener(actionListener);
    }
}

//Menu for admin
public class AdminPanel extends JPanel implements ActionListener{
    //Menu buttons
    JButton openAddStudentBtn;
    JButton openAddTeacherBtn;
    
    //Constructor 
    public AdminPanel() {
        this.setBounds(0, 0, Settings.WIDTH, Settings.HEIGHT);
        this.setLayout(null);
        this.setVisible(true);

        //Open add student frame
        openAddStudentBtn = new JButton("Add student");
        openAddStudentBtn.addActionListener(this);
        openAddStudentBtn.setFocusable(false);
        openAddStudentBtn.setBounds(150, 125, Settings.MENU_BTN_WIDTH, Settings.MENU_BTN_HEIGHT);

        //Adding the widgets
        this.add(openAddStudentBtn);
    }

    //Button methods
    //Open add student frame btn method
    private void openAddStudentFrame() {
        System.out.println("btn-1 clicked");
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        //Open add student frame
        if (e.getSource() == openAddStudentBtn) {
            openAddStudentFrame();
        }
    }
}
