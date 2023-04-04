package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import App.Settings;

//Add student to data base -> JFrame
public class AddStudent extends JFrame implements ActionListener{
    //Widgets
    JTextField firstNameField;
    JTextField lastNameField;
    JTextField ageField;
    JTextField gradeField;
    JTextField avgGrade;
    JTextField specSubject1;
    JTextField specSubject2;
    JButton addStudentBtn;

    //Constructor
    public AddStudent() {
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setTitle("Add Student");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This is temporary for the testing. Turn off later.
        this.setLocationRelativeTo(null); //Sets opening position to the center of the screen.
        this.setVisible(true);
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    //Test run for add_student
    public static void main(String[] args) {
        new AddStudent();
    }
}