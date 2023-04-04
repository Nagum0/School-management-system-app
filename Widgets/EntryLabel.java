package App.Widgets;

import javax.swing.JLabel;

import App.Settings;

//Entryfield label class
public class EntryLabel extends JLabel{
    
    //Constructor
    public EntryLabel(String text, int x, int y) {
        this.setText(text);
        this.setBounds(x, y, Settings.BTN_WIDTH, Settings.BTN_HEIGHT);
    }
}
