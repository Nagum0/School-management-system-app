package App.Widgets;

import java.awt.Dimension;

import javax.swing.JTextField;

import App.Settings;

//Entry field class
public class EntryField extends JTextField{
    //Constructor
    public EntryField(int x, int y) {
        this.setPreferredSize(new Dimension(Settings.ENTRY_WIDTH, Settings.ENTRY_HEIGHT));
        this.setBounds(x, y, Settings.ENTRY_WIDTH, Settings.ENTRY_HEIGHT);
    }

    //Return textfield value as string
    public String returnValue() {
        return this.getText();
    }
}
