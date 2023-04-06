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

//add teacher frame
public class AddTeacher extends JFrame implements ActionListener{
    //Widgets----------------------------------------------------
    //Labels
    EntryLabel firstNameLbl;
    EntryLabel lastNameLbl;
    EntryLabel ageLbl;
    EntryLabel titleLbl;
    EntryLabel subject1Lbl;
    EntryLabel subject2Lbl;
    EntryLabel yearsTaughtLbl;

    //Entryfields
    EntryField firstNameField;
    EntryField lastNameField;
    EntryField ageField;
    EntryField titleField;
    EntryField subject1Field;
    EntryField subject2Field;
    EntryField yearsTaughtField;

    //Buttons
    WriteFileBtn addTeacherBtn;

    //Constructor
    public AddTeacher() {
        //Window setup
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setResizable(false);
        this.setTitle("Add Student");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Temporary for testing
        this.setLocationRelativeTo(null); //Sets opening position to the center of the screen.
        this.setLayout(null);
        this.setVisible(true);

        //Widget setup
        firstNameLbl = new EntryLabel("First name: ", 250, 80);
        firstNameField = new EntryField(330, 90);

        lastNameLbl = new EntryLabel("Last name: ", 250, 130);
        lastNameField = new EntryField(330, 140);

        ageLbl = new EntryLabel("Age: ", 270, 180);
        ageField = new EntryField(330, 190);

        titleLbl = new EntryLabel("Title: ", 270, 230);
        titleField = new EntryField(330, 240);

        subject1Lbl = new EntryLabel("Subject 1: ", 250, 280);
        subject1Field = new EntryField(330, 290);

        subject2Lbl = new EntryLabel("Subject 2: ", 250, 330);
        subject2Field = new EntryField(330, 340);

        yearsTaughtLbl = new EntryLabel("Years taught: ", 230, 380);
        yearsTaughtField = new EntryField(330, 390);

        //Add student btn
        addTeacherBtn = new WriteFileBtn(300, 600, "Add teacher");
        addTeacherBtn.addActionListener(this);

        //Adding widgets
        this.add(firstNameLbl);
        this.add(firstNameField);

        this.add(lastNameLbl);
        this.add(lastNameField);

        this.add(ageLbl);
        this.add(ageField);
        
        this.add(titleLbl);
        this.add(titleField);

        this.add(subject1Lbl);
        this.add(subject1Field);

        this.add(subject2Lbl);
        this.add(subject2Field);

        this.add(yearsTaughtLbl);
        this.add(yearsTaughtField);

        this.add(addTeacherBtn);
    }

    //Action listeners
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addTeacherBtn) {
            //Writing student files
            try (FileWriter writer = new FileWriter(String.format("C:/Users/csabe/OneDrive/Desktop/school_magement_app/files/Teachers/%s%s.txt", firstNameField.returnValue(), lastNameField.returnValue()))) {
                writer.write(String.format("First name: %s\n", firstNameField.returnValue()));
                writer.write(String.format("Last name: %s\n", lastNameField.returnValue()));
                writer.write(String.format("Age: %s\n", ageField.returnValue()));
                writer.write(String.format("Title: %s\n", titleField.returnValue()));
                writer.write(String.format("Subject 1: %s\n", subject1Field.returnValue()));
                writer.write(String.format("Subject 2: %s\n", subject2Field.returnValue()));
                writer.write(String.format("Years taught: %s", yearsTaughtField.returnValue()));
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
