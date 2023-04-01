package school_magement_app;

import javax.swing.JFrame;

public class App {
    //Contrusctor
    public App() {
        buildApp();
    }

    //Main app build
    public void buildApp() {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(700, 700);
        mainFrame.setTitle("");

        

        //Make frame visible
        mainFrame.setVisible(true);
    }
}
