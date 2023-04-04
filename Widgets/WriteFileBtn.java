package App.Widgets;

import javax.swing.JButton;

import App.Settings;
import App.Admin.AddStudent;

//Write file btn class
public class WriteFileBtn extends JButton{
    
    //Constructor
    public WriteFileBtn(int x, int y, String text, AddStudent that) {
        this.setBounds(x, y, 200, Settings.BTN_HEIGHT);
        this.setFocusable(false);
        this.addActionListener(that);
        this.setText(text);
    }

    //Methods
    public void editFile() {
        
    }
}
