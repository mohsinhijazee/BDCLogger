/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.zeropoint.mobile.bdclogger;

import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import javax.microedition.lcdui.TextField;
import javax.microedition.midlet.*;

/**
 * @author mohsinhijazee
 */
public class PhoneInfo extends MIDlet implements CommandListener{
    
    private TextBox textBox;
    private Command exitCommand;
    private Command clearCommand;
    private Command getInfoCommand;
    private Command vibrateCommand;
    private Command flashCommand;

    public Command getFlashCommand() {

        if(flashCommand == null){
            flashCommand = new Command("Flash", Command.SCREEN, 3);
        }
        return flashCommand;
    }

    public Command getVibrateCommand() {

        if(vibrateCommand == null){
            vibrateCommand = new Command("Vibrate", Command.SCREEN, 4);
        }
        return vibrateCommand;
    }

    public Command getClearCommand() {
        if(clearCommand == null){
            clearCommand = new Command("Clear", Command.SCREEN, 2);
        }
        return clearCommand;
    }

    public Command getExitCommand() {
        if(exitCommand == null){
            exitCommand = new Command("Exit", Command.EXIT, 0);
        }
        return exitCommand;
    }

    public Command getGetInfoCommand() {
        if(getInfoCommand == null){
            getInfoCommand = new Command("Get Info", Command.SCREEN, 1);
        }
        return getInfoCommand;
    }

    public TextBox getTextBox() {
        if(textBox == null){
            textBox = new TextBox("System Information", "", 20, TextField.SENSITIVE);
            textBox.addCommand(getExitCommand());
            textBox.addCommand(getClearCommand());
            textBox.addCommand(getGetInfoCommand());
            textBox.addCommand(getFlashCommand());
            textBox.addCommand(getVibrateCommand());
            textBox.setCommandListener(this);
        }
        return textBox;
    }


    
    public void startApp() {
        Display.getDisplay(this).setCurrent(getTextBox());
    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    public void commandAction(Command c, Displayable d) {

        if(c == getGetInfoCommand()){
            String info = getPhoneInfo();
            getTextBox().setMaxSize(info.length());
            getTextBox().setString(info);
        }

        if(c == getClearCommand())
            getTextBox().setString(null);

        if(c == getExitCommand())
            notifyDestroyed();

        if(c == vibrateCommand)
            Display.getDisplay(this).vibrate(5000);

        if(c == flashCommand)
            Display.getDisplay(this).flashBacklight(5000);
    }

    private String getPhoneInfo(){
        String info = "";
        Display d = Display.getDisplay(this);
        Runtime r = Runtime.getRuntime();

        info += "Display.isColor() = " + d.isColor() + "\n";
        info += "Display.numAlphaLevels() = " + d.numAlphaLevels() + "\n";
        info += "Display.numColors() = " + d.numColors() + "\n";
        info += "Runtime.totalMemory() = " + r.totalMemory() /1024 + " KB\n";
        info += "Runtime.freeMemory() = " + r.freeMemory() /1024 + " KB\n";

        return info;
    }
}
