package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* Comments
 * C:/Users/csabe/OneDrive/Desktop/school_magement_app/files/Students/%s.txt
 */

public class MultiDimArray {
    String[][] dataArray;
    public static String[] fileArray = new String[7];

    /* Readfile method */
    static void readFile(String filePath) {
        File file = new File(filePath);

        try (Scanner scan = new Scanner(file)) {
            for (int i = 0; scan.hasNextLine(); i++) {
                String data = scan.nextLine();
                String[] dataSplit = data.split(" ", 2);
                fileArray[i] = dataSplit[1];
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* Edit existing file method */
    static void editFile(String filePath) {
        try (FileReader file = new FileReader(filePath)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* Main driver */
    public static void main(String[] args) {
        readFile("files/Students/ZekiBene.txt");
        
        for (int i = 0; i < fileArray.length; i++) {
            System.out.println(fileArray[i]);
        } 
    }
}