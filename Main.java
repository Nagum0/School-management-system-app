package App;

import App.Admin.AddStudent;
import App.Admin.AddTeacher;
import App.Admin.AdminPanel;

public class Main {
    private static App mainApp;

    //Draw menu after login
    public static void changePanel() {
        switch (Settings.nextPanel) {
            case "":
            System.out.println("An error occured");
                break;
            //Open admin menu
            case "admin_menu":
                mainApp.add(new AdminPanel());
                break;
            //Open teacher menu
            case "teacher_menu":
                System.out.println("Teacher menu");
                break;
            //Open student menu
            case "student_menu":
                System.out.println("Student menu");
                break;
            //Open admin add student menu
            case "add_student":
                new AddStudent();
                break;
            //Open admin add teacher menu
            case "add_teacher":
                new AddTeacher();
                break;
        }
    }
    public static void main(String[] args) {
        //Initiates App Class that extends JFrame class
        mainApp = new App();
    }
}
