package school_magement_app;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Login extends JPanel implements ActionListener{
    int width;
    int height;
    JLabel loginLbl;
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
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Login title label
        loginLbl = new JLabel("Login");
        loginLbl.setFont(new Font(Settings.FONT, Font.BOLD, Settings.TITLE_FONT_SIZE));
        this.add(loginLbl);


        //Login button
        loginBtn = new JButton("Log in");
        loginBtn.addActionListener(this); //Setup actionlistener
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
        //User data hashmap
        userLoginData = new HashMap<String, String>();
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

        System.out.println(userLoginData);

        //Check correct inputs
        String tempUser = "teach00";
        String tempPass = "2222";

        if (tempPass.equals(userLoginData.get(tempUser))) {
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
