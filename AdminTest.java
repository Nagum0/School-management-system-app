package App.Admin;

import javax.swing.JFrame;

import App.Settings;

public class AdminTest extends JFrame{

    public AdminTest() {
        this.setSize(Settings.WIDTH, Settings.HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new AdminPanel());

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AdminTest();
    }
}
