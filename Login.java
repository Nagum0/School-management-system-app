package school_magement_app;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Login extends JPanel implements ActionListener{
    int width;
    int height;
    Label loginLbl;
    JButton loginBtn;
    private HashMap<String, String> userLoginData;

    //Login Contructor
    public Login(int width, int height) {
        //Variables
        this.width = width;
        this.height = height;

        //Panel build
        this.setBounds(0, 0, this.width, this.height);

        //Login title label
        loginLbl = new Label("Login");
        loginLbl.setFont(new Font(Settings.FONT, Font.BOLD, Settings.TITLE_FONT_SIZE));
        this.add(loginLbl);

        //Login button
        loginBtn = new JButton();
        loginBtn.addActionListener(this); //Setup actionlistener
        loginBtn.setText("Log in");
        loginBtn.setFont(new Font(Settings.FONT, Font.BOLD, Settings.FONT_SIZE));
        loginBtn.setFocusable(false);
        this.add(loginBtn);
    }

    //Login
    private void login() {
        System.out.println("loginBtn clicked");
        readLoginData();
    }

    //Get login data from txt file
    private void readLoginData() {
        userLoginData = new HashMap<String, String>();
        userLoginData.put("admin00", "0000");

        System.out.println(userLoginData.get("admin00"));
    }

    //Actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            login();
        }
    }
}
