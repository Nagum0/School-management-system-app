package school_magement_app;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JPanel;

public class Login extends JPanel {
    int width;
    int height;

    //Login Contructor
    public Login(int width, int height) {
        //Variables
        this.width = width;
        this.height = height;

        //Panel build
        this.setBounds(0, 0, this.width, this.height);

        //Login title label
        Label loginLbl = new Label("Login");
        loginLbl.setFont(new Font(Settings.FONT, Font.BOLD, Settings.TITLE_FONT_SIZE));
        this.add(loginLbl);
    }
}
