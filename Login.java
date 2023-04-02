package school_magement_app;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JPanel implements ActionListener{
    int width;
    int height;
    //Widgets
    JLabel loginLbl;

    //Username entry
    JLabel userNameLbl;
    JTextField userNameField;
    String userNameEntry;

    //Password entry
    JLabel passwordLbl;
    JPasswordField passwordField;
    char[] passwordEntry;

    //Login button
    JButton loginBtn;

    //Login data hashmap
    private HashMap<String, String> userLoginData;

    //Login Contructor
    public Login(int width, int height) {
        //Variables
        this.width = width;
        this.height = height;

        //Panel build
        this.setBounds(0, 0, this.width, this.height);
        this.setLayout(null);

        //Login title label
        loginLbl = new JLabel("Login");
        loginLbl.setFont(new Font(Settings.FONT, Font.BOLD, Settings.TITLE_FONT_SIZE));
        loginLbl.setBounds(370, 50, Settings.BTN_WIDTH, Settings.BTN_HEIGHT);

        //Username label
        userNameLbl = new JLabel("Username: ");
        userNameLbl.setFont(new Font(Settings.FONT, Font.PLAIN, Settings.FONT_SIZE));
        userNameLbl.setBounds(200, 150, Settings.BTN_WIDTH, Settings.BTN_HEIGHT);

        //Username textfield
        userNameField = new JTextField();
        userNameField.setPreferredSize(new Dimension(250, 40));
        userNameField.setBounds(300, 150, 250, 40);

        //Password label
        passwordLbl = new JLabel("Password");
        passwordLbl.setFont(new Font(Settings.FONT, Font.PLAIN, Settings.FONT_SIZE));
        passwordLbl.setBounds(200, 250, Settings.BTN_WIDTH, Settings.BTN_HEIGHT);

        //Password entry
        passwordField = new JPasswordField();
        passwordField.setPreferredSize(new Dimension(250, 40));
        passwordField.setBounds(300, 250, 250, 40);

        //Login button
        loginBtn = new JButton("Log in");
        loginBtn.addActionListener(this); //Setup actionlistener
        loginBtn.setFont(new Font(Settings.FONT, Font.BOLD, Settings.BTN_FONT_SIZE));
        loginBtn.setBounds(350, 400, Settings.BTN_WIDTH, Settings.BTN_HEIGHT); //Positioning login button
        loginBtn.setFocusable(false);

        //Adding the widgets
        this.add(loginLbl);
        this.add(userNameLbl);
        this.add(userNameField);
        this.add(passwordLbl);
        this.add(passwordField);
        this.add(loginBtn);
    }

    //Login
    private void login() {
        checkLoginData();
    }

    //Get login data from txt file
    private void checkLoginData() {
        //User data hashmap
        userLoginData = new HashMap<String, String>();

        //Username getText
        userNameEntry = userNameField.getText();

        //Password getText
        passwordEntry = passwordField.getPassword();
        String convertedPass = String.valueOf(passwordEntry); //Converted char[] to string

        //File reading
        File file = new File("school_magement_app/files/loginDataBase.txt");

        try (Scanner fileScan = new Scanner(file)) {
            while (fileScan.hasNextLine()) {
                String data = fileScan.nextLine();
                String[] dataSplit = data.split(" ", 2);
                userLoginData.put(dataSplit[0], dataSplit[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Check correct inputs
        if (convertedPass.equals(userLoginData.get(userNameEntry))) {
            System.out.println("Logged in");
            this.setVisible(false);
        }
        else {
            System.out.println("Incorrect username or password");
        }
    }

    //Actionlistener
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            login();
        }
    }
}
