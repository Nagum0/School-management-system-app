package App.Admin.Spreadsheets;

import javax.swing.JFrame;

import App.Settings;

/* Student spreadsheet frame */
public class StudentSheetFrame extends JFrame {
    StudentSheet studentSpreadSheet;

    /* Constructor */
    public StudentSheetFrame() {
        /* System.out.println("Student spreadsheet frame opened"); */

        /* Frame setup */
        this.setTitle("Student Spreadsheet");
        this.setSize(Settings.SPREADSHEET_WIDTH, Settings.HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        studentSpreadSheet = new StudentSheet();
    }

    /* Main for testing */
    public static void main(String[] args) {
        new StudentSheetFrame();
    }
}
