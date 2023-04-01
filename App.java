package school_magement_app;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

//Main GUI for the application

public class App extends JFrame{
    //Contrusctor //Main frame
    public App() {
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setTitle("School Management App");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        //Set logo for app
        ImageIcon logo = new ImageIcon("school_magement_app/files/logo.png");
        this.setIconImage(logo.getImage());

        //Call login panel
        drawLogin();

        //Make frame visible
        this.setVisible(true);
    }

    //Methods-----------------------------------------------------------------------------
    private void drawLogin() {
        this.add(new Login(Settings.WIDTH, Settings.HEIGHT));
    }
}
