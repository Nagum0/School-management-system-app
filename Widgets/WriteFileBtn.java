package App.Widgets;

import javax.swing.JButton;

import App.Settings;

//Write file btn class
public class WriteFileBtn extends JButton{
    
    //Constructor
    public WriteFileBtn(int x, int y, String text) {
        this.setBounds(x, y, 200, Settings.BTN_HEIGHT);
        this.setFocusable(false);
        this.setText(text);
    }
}
