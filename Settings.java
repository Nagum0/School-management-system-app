package school_magement_app;

import java.util.HashMap;

public class Settings {
    public static int WIDTH = 800;
    public static int HEIGHT = 700; 
    public static String FONT = "Arial";
    public static int FONT_SIZE = 20;
    public static int TITLE_FONT_SIZE = 25;

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
