package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import App.Settings;
import App.Widgets.EntryField;
import App.Widgets.EntryLabel;
import App.Widgets.WriteFileBtn;

//Add student to data base -> JFrame
public class AddStudent extends JFrame implements ActionListener {
    //Widgets----------------------------------------------------
    //Labels
    EntryLabel firstNameLbl;
    EntryLabel lastNameLbl;
    EntryLabel ageLbl;
    EntryLabel gradeLbl;
    EntryLabel avgGradeLbl;
    EntryLabel specSubject1Lbl;
    EntryLabel specSubject2Lbl;

    //Entryfields
    EntryField firstNameField;
    EntryField lastNameField;
    EntryField ageField;
    EntryField gradeField;
    EntryField avgGrade;
    EntryField specSubject1;
    EntryField specSubject2;

    //Buttons
    WriteFileBtn addStudentBtn;

    //Constructor
    public AddStudent() {
        //Window setup
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setResizable(false);
        this.setTitle("Add Student");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //This is temporary for the testing. Turn off later.
        this.setLocationRelativeTo(null); //Sets opening position to the center of the screen.
        this.setLayout(null);
        this.setVisible(true);

        //Settng up widgets
        firstNameLbl = new EntryLabel("First name: ", 250, 80);
        firstNameField = new EntryField(330, 90);

        lastNameLbl = new EntryLabel("Last name: ", 250, 130);
        lastNameField = new EntryField(330, 140);

        ageLbl = new EntryLabel("Age: ", 270, 180);
        ageField = new EntryField(330, 190);

        gradeLbl = new EntryLabel("Grade: ", 270, 230);
        gradeField = new EntryField(330, 240);

        avgGradeLbl = new EntryLabel("Avg grade: ", 250, 280);
        avgGrade = new EntryField(330, 290);

        //Add student btn
        addStudentBtn = new WriteFileBtn(300, 600, "Add student", this);

        //Adding widgets
        this.add(firstNameLbl);
        this.add(firstNameField);

        this.add(lastNameLbl);
        this.add(lastNameField);

        this.add(ageLbl);
        this.add(ageField);
        
        this.add(gradeLbl);
        this.add(gradeField);

        this.add(avgGradeLbl);
        this.add(avgGrade);

        this.add(addStudentBtn);
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStudentBtn) {
            System.out.println(firstNameField.returnValue());
            System.out.println(lastNameField.returnValue());
        }
    }

    //Test run for add_student
    public static void main(String[] args) {
        new AddStudent();
    }
}