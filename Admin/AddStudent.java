package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import App.Settings;
import App.Widgets.EntryField;
import App.Widgets.WriteFileBtn;

//Add student to data base -> JFrame
public class AddStudent extends JFrame implements ActionListener{
    //Widgets
    EntryField firstNameField;
    JTextField lastNameField;
    JTextField ageField;
    JTextField gradeField;
    JTextField avgGrade;
    JTextField specSubject1;
    JTextField specSubject2;
    WriteFileBtn addStudentBtn;

    //Constructor
    public AddStudent() {
        //Window setup
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setTitle("Add Student");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This is temporary for the testing. Turn off later.
        this.setLocationRelativeTo(null); //Sets opening position to the center of the screen.
        this.setLayout(null);
        this.setVisible(true);

        //Settng up widgets
        firstNameField = new EntryField(50, 50);

        //Add student btn
        addStudentBtn = new WriteFileBtn(50, 100, "Add student", this);

        //Adding widgets
        this.add(firstNameField);
        this.add(addStudentBtn);
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStudentBtn) {
            System.out.println(firstNameField.returnValue());
        }
    }
    //Test run for add_student
    public static void main(String[] args) {
        new AddStudent();
    }
}