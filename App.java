package App;

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
        ImageIcon logo = new ImageIcon("C:/Users/csabe/OneDrive/Desktop/school_magement_app/images/logo.png");
        this.setIconImage(logo.getImage());

        //Call login panel
        drawLogin();

        //Make frame visible
        this.setVisible(true);
    }

    //Methods-----------------------------------------------------------------------------
    //Darw login menu
    private void drawLogin() {
        this.add(new Login(Settings.WIDTH, Settings.HEIGHT));
    }
}
