package App.Admin.Spreadsheets;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/* Student spreadsheet frame */
public class StudentSheetFrame extends JFrame {
    /* Objects */
    JTable table;
    JScrollPane sp;

    /* Constructor */
    public StudentSheetFrame() {
        /* Spreadsheet data */
        //Columns
        String[] columns = {"Name", "Age", "Avg grade", "Gender"};

        //Sheet data
        String[][] data = {
            {"Zeki", "18", "1.7", "Male"},
            {"Astolfo", "18", "1.7", "Male"},
            {"Ferris", "18", "1.3", "Male"}
        };

        /* Frame setup */
        this.setTitle("Student Spreadsheet");
        this.setSize(500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        /* JTable setup */
        table = new JTable(data, columns);
        table.setBounds(0, 0, 200, 300);

        /* JScrollPane setup */
        sp = new JScrollPane(table);

        /* Adding elements */
        this.add(sp);
    }

    /* Main for testing */
    public static void main(String[] args) {
        new StudentSheetFrame();
    }
}
