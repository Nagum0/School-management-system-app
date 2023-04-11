package App.Admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

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

        specSubject1Lbl = new EntryLabel("Spec subject 1: ", 250, 330);
        specSubject1 = new EntryField(330, 340);

        specSubject2Lbl = new EntryLabel("Spec subject 2: ", 250, 380);
        specSubject2 = new EntryField(330, 390);

        //Add student btn
        addStudentBtn = new WriteFileBtn(300, 600, "Add student");
        addStudentBtn.addActionListener(this);

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

        this.add(specSubject1Lbl);
        this.add(specSubject1);

        this.add(specSubject2Lbl);
        this.add(specSubject2);

        this.add(addStudentBtn);
    }

    //Button actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addStudentBtn) {
            //Writing student files
            try (FileWriter writer = new FileWriter(String.format("C:/Users/csabe/OneDrive/Desktop/school_magement_app/files/Students/%s%s.txt", firstNameField.returnValue(), lastNameField.returnValue()))) {
                writer.write(String.format("First_name: %s\n", firstNameField.returnValue()));
                writer.write(String.format("Last_name: %s\n", lastNameField.returnValue()));
                writer.write(String.format("Age: %s\n", ageField.returnValue()));
                writer.write(String.format("Grade: %s\n", gradeField.returnValue()));
                writer.write(String.format("Avg_grade: %s\n", avgGrade.returnValue()));
                writer.write(String.format("Spec_subject_1: %s\n", specSubject1.returnValue()));
                writer.write(String.format("Spec_subject_2: %s", specSubject2.returnValue()));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}