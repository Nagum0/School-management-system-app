package App;

import java.io.FileWriter;
import java.io.IOException;

public class Settings {
    //Panel change variable
    public static String nextPanel = "";

    //Main settings
    public static int WIDTH = 800;
    public static int HEIGHT = 700;
    public static String FONT = "Arial";
    public static int FONT_SIZE = 15;
    public static int TITLE_FONT_SIZE = 25;

    //Entry field
    public static int ENTRY_WIDTH = 200;
    public static int ENTRY_HEIGHT = 30;

    //Button settings
    public static int BTN_WIDTH = 100;
    public static int BTN_HEIGHT = 50;
    public static int BTN_FONT_SIZE = 14;
    public static int MENU_BTN_WIDTH = 150;
    public static int MENU_BTN_HEIGHT = 75;

    //Test stuff---------------------------------
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:/Users/csabe/OneDrive/Desktop/school_magement_app/files/Students/test.txt");
        writer.write("test \n");
        writer.write("lol \n");
        writer.close();
    }   
}
