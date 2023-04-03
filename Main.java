package App;

import App.Admin.AdminPanel;

public class Main {
    private static App mainApp;

    //Draw menu after login
    public static void changePanel() {
        switch (Settings.nextPanel) {
            case "":
            System.out.println("An error occured");
                break;
            case "admin_menu":
                mainApp.add(new AdminPanel());
                break;
            case "teacher_menu":
                System.out.println("Teacher menu");
                break;
            case "student_menu":
                System.out.println("Student menu");
                break;
            case "add_student":
                System.out.println("Add student frame opened");
                break;
            case "add_teacher":
                System.out.println("Add teacher frame opened");
                break;
        }
    }
    public static void main(String[] args) {
        //Initiates App Class that extends JFrame class
        mainApp = new App();
    }
}
