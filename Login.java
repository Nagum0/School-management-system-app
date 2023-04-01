package school_magement_app;

import java.awt.GridLayout;
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
        this.setLayout(new GridLayout(5, 1, 0, 0));

        //Login title label
        Label loginLbl = new Label("Login");
        this.add(loginLbl);
    }
}
