package school_magement_app;

import java.util.HashMap;

public class Settings {
    //Main settings
    public static int WIDTH = 800;
    public static int HEIGHT = 700;
    public static String FONT = "Arial";
    public static int FONT_SIZE = 15;
    public static int TITLE_FONT_SIZE = 25;

    //Button settings
    public static int BTN_WIDTH = 100;
    public static int BTN_HEIGHT = 50;
    public static int BTN_FONT_SIZE = 14;

    //Test accounts hashmap
    private static HashMap<String, String> dict;

    //Test stuff---------------------------------
    public static void main(String[] args) {
        String user = "admin00";
        String pass = "0000";

        dict = new HashMap<String, String>();
        dict.put("admin00", "0000");
        dict.put("student00", "1111");
        dict.put("teach00", "2222");

        if (pass == dict.get(user)) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }   
}
