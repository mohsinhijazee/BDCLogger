/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.zeropoint.mobile.bdclogger;

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import org.netbeans.microedition.lcdui.SplashScreen;

/**
 * @author Mohsin Hijazee
 */
public class HelloMIDlet extends MIDlet implements CommandListener {

    private boolean midletPaused = false;

    //<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Command exitCommand;
    private Command takeTestCommand;
    private Command okCommand;
    private Command backCommand;
    private Command aboutCommand;
    private Command statsCommand;
    private Command exitCommand1;
    private Form bdcForm;
    private ChoiceGroup choiceGroup;
    private ChoiceGroup choiceGroup1;
    private ChoiceGroup choiceGroup2;
    private StringItem stringItem;
    private ChoiceGroup choiceGroup3;
    private ChoiceGroup choiceGroup4;
    private ChoiceGroup choiceGroup5;
    private ChoiceGroup choiceGroup6;
    private ChoiceGroup choiceGroup7;
    private SplashScreen splashScreen;
    private Form mainForm;
    private Ticker ticker;
    //</editor-fold>//GEN-END:|fields|0|

    /**
     * The HelloMIDlet constructor.
     */
    public HelloMIDlet() {
    }

    //<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
    //</editor-fold>//GEN-END:|methods|0|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initilizes the application.
     * It is called only once when the MIDlet is started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
    }//GEN-BEGIN:|0-initialize|2|
    //</editor-fold>//GEN-END:|0-initialize|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
        switchDisplayable(null, getSplashScreen());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
    }//GEN-BEGIN:|3-startMIDlet|2|
    //</editor-fold>//GEN-END:|3-startMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
    }//GEN-BEGIN:|4-resumeMIDlet|2|
    //</editor-fold>//GEN-END:|4-resumeMIDlet|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code> instance is taken from <code>getDisplay</code> method. This method is used by all actions in the design for switching displayable.
     * @param alert the Alert which is temporarily set to the display; if <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
        Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
    }//GEN-BEGIN:|5-switchDisplayable|2|
    //</editor-fold>//GEN-END:|5-switchDisplayable|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a particular displayable.
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {//GEN-END:|7-commandAction|0|7-preCommandAction
        // write pre-action user code here
        if (displayable == bdcForm) {//GEN-BEGIN:|7-commandAction|1|42-preAction
            if (command == backCommand) {//GEN-END:|7-commandAction|1|42-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|2|42-postAction
                // write post-action user code here
            } else if (command == okCommand) {//GEN-LINE:|7-commandAction|3|44-preAction
                // write pre-action user code here
                calculateScore();//GEN-LINE:|7-commandAction|4|44-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|5|48-preAction
        } else if (displayable == mainForm) {
            if (command == aboutCommand) {//GEN-END:|7-commandAction|5|48-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|6|48-postAction
                // write post-action user code here
            } else if (command == exitCommand) {//GEN-LINE:|7-commandAction|7|53-preAction
                // write pre-action user code here
                exitMIDlet();//GEN-LINE:|7-commandAction|8|53-postAction
                // write post-action user code here
            } else if (command == statsCommand) {//GEN-LINE:|7-commandAction|9|46-preAction
                // write pre-action user code here
//GEN-LINE:|7-commandAction|10|46-postAction
                // write post-action user code here
            } else if (command == takeTestCommand) {//GEN-LINE:|7-commandAction|11|38-preAction
                // write pre-action user code here
                switchDisplayable(null, getBdcForm());//GEN-LINE:|7-commandAction|12|38-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|13|32-preAction
        } else if (displayable == splashScreen) {
            if (command == SplashScreen.DISMISS_COMMAND) {//GEN-END:|7-commandAction|13|32-preAction
                // write pre-action user code here
                switchDisplayable(null, getMainForm());//GEN-LINE:|7-commandAction|14|32-postAction
                // write post-action user code here
            }//GEN-BEGIN:|7-commandAction|15|7-postCommandAction
        }//GEN-END:|7-commandAction|15|7-postCommandAction
        // write post-action user code here
    }//GEN-BEGIN:|7-commandAction|16|
    //</editor-fold>//GEN-END:|7-commandAction|16|


    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|18-getter|0|18-preInit
    /**
     * Returns an initiliazed instance of exitCommand component.
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {//GEN-END:|18-getter|0|18-preInit
            // write pre-init user code here
            exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|18-getter|1|18-postInit
            // write post-init user code here
        }//GEN-BEGIN:|18-getter|2|
        return exitCommand;
    }
    //</editor-fold>//GEN-END:|18-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: bdcForm ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initiliazed instance of bdcForm component.
     * @return the initialized component instance
     */
    public Form getBdcForm() {
        if (bdcForm == null) {//GEN-END:|14-getter|0|14-preInit
            // write pre-init user code here
            bdcForm = new Form("Welcome", new Item[] { getStringItem(), getChoiceGroup(), getChoiceGroup1(), getChoiceGroup2(), getChoiceGroup3(), getChoiceGroup4(), getChoiceGroup5(), getChoiceGroup6(), getChoiceGroup7() });//GEN-BEGIN:|14-getter|1|14-postInit
            bdcForm.addCommand(getBackCommand());
            bdcForm.addCommand(getOkCommand());
            bdcForm.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
            // write post-init user code here
        }//GEN-BEGIN:|14-getter|2|
        return bdcForm;
    }
    //</editor-fold>//GEN-END:|14-getter|2|



    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup ">//GEN-BEGIN:|22-getter|0|22-preInit
    /**
     * Returns an initiliazed instance of choiceGroup component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup() {
        if (choiceGroup == null) {//GEN-END:|22-getter|0|22-preInit
            // write pre-init user code here
            choiceGroup = new ChoiceGroup("01. Feeling sad or down in the dumps", Choice.EXCLUSIVE);//GEN-BEGIN:|22-getter|1|22-postInit
            choiceGroup.append("Not At All", null);
            choiceGroup.append("Somewhat", null);
            choiceGroup.append("Moderately", null);
            choiceGroup.append("A Lot", null);
            choiceGroup.append("Extremely", null);
            choiceGroup.setFitPolicy(Choice.TEXT_WRAP_DEFAULT);
            choiceGroup.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup.setFont(0, null);
            choiceGroup.setFont(1, null);
            choiceGroup.setFont(2, null);
            choiceGroup.setFont(3, null);
            choiceGroup.setFont(4, null);//GEN-END:|22-getter|1|22-postInit
            // write post-init user code here
        }//GEN-BEGIN:|22-getter|2|
        return choiceGroup;
    }
    //</editor-fold>//GEN-END:|22-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: splashScreen ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initiliazed instance of splashScreen component.
     * @return the initialized component instance
     */
    public SplashScreen getSplashScreen() {
        if (splashScreen == null) {//GEN-END:|30-getter|0|30-preInit
            // write pre-init user code here
            splashScreen = new SplashScreen(getDisplay());//GEN-BEGIN:|30-getter|1|30-postInit
            splashScreen.setTitle("splashScreen");
            splashScreen.setCommandListener(this);
            splashScreen.setText("Burns Depression Checklist");//GEN-END:|30-getter|1|30-postInit
            // write post-init user code here
        }//GEN-BEGIN:|30-getter|2|
        return splashScreen;
    }
    //</editor-fold>//GEN-END:|30-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: ticker ">//GEN-BEGIN:|29-getter|0|29-preInit
    /**
     * Returns an initiliazed instance of ticker component.
     * @return the initialized component instance
     */
    public Ticker getTicker() {
        if (ticker == null) {//GEN-END:|29-getter|0|29-preInit
            // write pre-init user code here
            ticker = new Ticker("Check your depression");//GEN-LINE:|29-getter|1|29-postInit
            // write post-init user code here
        }//GEN-BEGIN:|29-getter|2|
        return ticker;
    }
    //</editor-fold>//GEN-END:|29-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: takeTestCommand ">//GEN-BEGIN:|37-getter|0|37-preInit
    /**
     * Returns an initiliazed instance of takeTestCommand component.
     * @return the initialized component instance
     */
    public Command getTakeTestCommand() {
        if (takeTestCommand == null) {//GEN-END:|37-getter|0|37-preInit
            // write pre-init user code here
            takeTestCommand = new Command("Take test", "Take BDC Test", Command.ITEM, 0);//GEN-LINE:|37-getter|1|37-postInit
            // write post-init user code here
        }//GEN-BEGIN:|37-getter|2|
        return takeTestCommand;
    }
    //</editor-fold>//GEN-END:|37-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: backCommand ">//GEN-BEGIN:|41-getter|0|41-preInit
    /**
     * Returns an initiliazed instance of backCommand component.
     * @return the initialized component instance
     */
    public Command getBackCommand() {
        if (backCommand == null) {//GEN-END:|41-getter|0|41-preInit
            // write pre-init user code here
            backCommand = new Command("Back", Command.BACK, 0);//GEN-LINE:|41-getter|1|41-postInit
            // write post-init user code here
        }//GEN-BEGIN:|41-getter|2|
        return backCommand;
    }
    //</editor-fold>//GEN-END:|41-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: okCommand ">//GEN-BEGIN:|43-getter|0|43-preInit
    /**
     * Returns an initiliazed instance of okCommand component.
     * @return the initialized component instance
     */
    public Command getOkCommand() {
        if (okCommand == null) {//GEN-END:|43-getter|0|43-preInit
            // write pre-init user code here
            okCommand = new Command("Ok", Command.OK, 0);//GEN-LINE:|43-getter|1|43-postInit
            // write post-init user code here
        }//GEN-BEGIN:|43-getter|2|
        return okCommand;
    }
    //</editor-fold>//GEN-END:|43-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: statsCommand ">//GEN-BEGIN:|45-getter|0|45-preInit
    /**
     * Returns an initiliazed instance of statsCommand component.
     * @return the initialized component instance
     */
    public Command getStatsCommand() {
        if (statsCommand == null) {//GEN-END:|45-getter|0|45-preInit
            // write pre-init user code here
            statsCommand = new Command("View Statistics", "View previous test statistics and history", Command.ITEM, 0);//GEN-LINE:|45-getter|1|45-postInit
            // write post-init user code here
        }//GEN-BEGIN:|45-getter|2|
        return statsCommand;
    }
    //</editor-fold>//GEN-END:|45-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: aboutCommand ">//GEN-BEGIN:|47-getter|0|47-preInit
    /**
     * Returns an initiliazed instance of aboutCommand component.
     * @return the initialized component instance
     */
    public Command getAboutCommand() {
        if (aboutCommand == null) {//GEN-END:|47-getter|0|47-preInit
            // write pre-init user code here
            aboutCommand = new Command("About...", "About the Application", Command.ITEM, 0);//GEN-LINE:|47-getter|1|47-postInit
            // write post-init user code here
        }//GEN-BEGIN:|47-getter|2|
        return aboutCommand;
    }
    //</editor-fold>//GEN-END:|47-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand1 ">//GEN-BEGIN:|49-getter|0|49-preInit
    /**
     * Returns an initiliazed instance of exitCommand1 component.
     * @return the initialized component instance
     */
    public Command getExitCommand1() {
        if (exitCommand1 == null) {//GEN-END:|49-getter|0|49-preInit
            // write pre-init user code here
            exitCommand1 = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|49-getter|1|49-postInit
            // write post-init user code here
        }//GEN-BEGIN:|49-getter|2|
        return exitCommand1;
    }
    //</editor-fold>//GEN-END:|49-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: mainForm ">//GEN-BEGIN:|36-getter|0|36-preInit
    /**
     * Returns an initiliazed instance of mainForm component.
     * @return the initialized component instance
     */
    public Form getMainForm() {
        if (mainForm == null) {//GEN-END:|36-getter|0|36-preInit
            // write pre-init user code here
            mainForm = new Form("form");//GEN-BEGIN:|36-getter|1|36-postInit
            mainForm.addCommand(getTakeTestCommand());
            mainForm.addCommand(getStatsCommand());
            mainForm.addCommand(getAboutCommand());
            mainForm.addCommand(getExitCommand());
            mainForm.setCommandListener(this);//GEN-END:|36-getter|1|36-postInit
            // write post-init user code here
        }//GEN-BEGIN:|36-getter|2|
        return mainForm;
    }
    //</editor-fold>//GEN-END:|36-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup1 ">//GEN-BEGIN:|55-getter|0|55-preInit
    /**
     * Returns an initiliazed instance of choiceGroup1 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup1() {
        if (choiceGroup1 == null) {//GEN-END:|55-getter|0|55-preInit
            // write pre-init user code here
            choiceGroup1 = new ChoiceGroup("02. Feeling unhappy or blue", Choice.EXCLUSIVE);//GEN-BEGIN:|55-getter|1|55-postInit
            choiceGroup1.append("Not At All", null);
            choiceGroup1.append("Somewhat", null);
            choiceGroup1.append("Moderately", null);
            choiceGroup1.append("A Lot", null);
            choiceGroup1.append("Extremely", null);
            choiceGroup1.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup1.setFont(0, null);
            choiceGroup1.setFont(1, null);
            choiceGroup1.setFont(2, null);
            choiceGroup1.setFont(3, null);
            choiceGroup1.setFont(4, null);//GEN-END:|55-getter|1|55-postInit
            // write post-init user code here
        }//GEN-BEGIN:|55-getter|2|
        return choiceGroup1;
    }
    //</editor-fold>//GEN-END:|55-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: stringItem ">//GEN-BEGIN:|61-getter|0|61-preInit
    /**
     * Returns an initiliazed instance of stringItem component.
     * @return the initialized component instance
     */
    public StringItem getStringItem() {
        if (stringItem == null) {//GEN-END:|61-getter|0|61-preInit
            // write pre-init user code here
            stringItem = new StringItem("Thoughts And Feelings", "About your thoughts and feelings", Item.PLAIN);//GEN-BEGIN:|61-getter|1|61-postInit
            stringItem.setLayout(ImageItem.LAYOUT_DEFAULT);//GEN-END:|61-getter|1|61-postInit
            // write post-init user code here
        }//GEN-BEGIN:|61-getter|2|
        return stringItem;
    }
    //</editor-fold>//GEN-END:|61-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup2 ">//GEN-BEGIN:|62-getter|0|62-preInit
    /**
     * Returns an initiliazed instance of choiceGroup2 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup2() {
        if (choiceGroup2 == null) {//GEN-END:|62-getter|0|62-preInit
            // write pre-init user code here
            choiceGroup2 = new ChoiceGroup("03. Crying spells or tearfullness", Choice.EXCLUSIVE);//GEN-BEGIN:|62-getter|1|62-postInit
            choiceGroup2.append("Not At All", null);
            choiceGroup2.append("Somewhat", null);
            choiceGroup2.append("Moderately", null);
            choiceGroup2.append("A Lot", null);
            choiceGroup2.append("Extremely", null);
            choiceGroup2.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup2.setFont(0, null);
            choiceGroup2.setFont(1, null);
            choiceGroup2.setFont(2, null);
            choiceGroup2.setFont(3, null);
            choiceGroup2.setFont(4, null);//GEN-END:|62-getter|1|62-postInit
            // write post-init user code here
        }//GEN-BEGIN:|62-getter|2|
        return choiceGroup2;
    }
    //</editor-fold>//GEN-END:|62-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup3 ">//GEN-BEGIN:|68-getter|0|68-preInit
    /**
     * Returns an initiliazed instance of choiceGroup3 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup3() {
        if (choiceGroup3 == null) {//GEN-END:|68-getter|0|68-preInit
            // write pre-init user code here
            choiceGroup3 = new ChoiceGroup("04. Feeling discouraged", Choice.EXCLUSIVE);//GEN-BEGIN:|68-getter|1|68-postInit
            choiceGroup3.append("Not At All", null);
            choiceGroup3.append("Somewhat", null);
            choiceGroup3.append("Moderately", null);
            choiceGroup3.append("A Lot", null);
            choiceGroup3.append("Extremely", null);
            choiceGroup3.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup3.setFont(0, null);
            choiceGroup3.setFont(1, null);
            choiceGroup3.setFont(2, null);
            choiceGroup3.setFont(3, null);
            choiceGroup3.setFont(4, null);//GEN-END:|68-getter|1|68-postInit
            // write post-init user code here
        }//GEN-BEGIN:|68-getter|2|
        return choiceGroup3;
    }
    //</editor-fold>//GEN-END:|68-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup4 ">//GEN-BEGIN:|74-getter|0|74-preInit
    /**
     * Returns an initiliazed instance of choiceGroup4 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup4() {
        if (choiceGroup4 == null) {//GEN-END:|74-getter|0|74-preInit
            // write pre-init user code here
            choiceGroup4 = new ChoiceGroup("05. Feeling hopeless", Choice.EXCLUSIVE);//GEN-BEGIN:|74-getter|1|74-postInit
            choiceGroup4.append("Not At All", null);
            choiceGroup4.append("Somewhat", null);
            choiceGroup4.append("Moderately", null);
            choiceGroup4.append("A Lot", null);
            choiceGroup4.append("Exteremely", null);
            choiceGroup4.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup4.setFont(0, null);
            choiceGroup4.setFont(1, null);
            choiceGroup4.setFont(2, null);
            choiceGroup4.setFont(3, null);
            choiceGroup4.setFont(4, null);//GEN-END:|74-getter|1|74-postInit
            // write post-init user code here
        }//GEN-BEGIN:|74-getter|2|
        return choiceGroup4;
    }
    //</editor-fold>//GEN-END:|74-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Method: calculateScore ">//GEN-BEGIN:|80-entry|0|81-preAction
    /**
     * Performs an action assigned to the calculateScore entry-point.
     */
    public void calculateScore() {//GEN-END:|80-entry|0|81-preAction
        // write pre-action user code here
        switchDisplayable(null, getMainForm());//GEN-LINE:|80-entry|1|81-postAction
        // write post-action user code here
    }//GEN-BEGIN:|80-entry|2|
    //</editor-fold>//GEN-END:|80-entry|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup5 ">//GEN-BEGIN:|84-getter|0|84-preInit
    /**
     * Returns an initiliazed instance of choiceGroup5 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup5() {
        if (choiceGroup5 == null) {//GEN-END:|84-getter|0|84-preInit
            // write pre-init user code here
            choiceGroup5 = new ChoiceGroup("06. Low self-esteem", Choice.EXCLUSIVE);//GEN-BEGIN:|84-getter|1|84-postInit
            choiceGroup5.append("Not At All", null);
            choiceGroup5.append("Somewhat", null);
            choiceGroup5.append("Moderately", null);
            choiceGroup5.append("A Lot", null);
            choiceGroup5.append("Exteremely", null);
            choiceGroup5.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup5.setFont(0, null);
            choiceGroup5.setFont(1, null);
            choiceGroup5.setFont(2, null);
            choiceGroup5.setFont(3, null);
            choiceGroup5.setFont(4, null);//GEN-END:|84-getter|1|84-postInit
            // write post-init user code here
        }//GEN-BEGIN:|84-getter|2|
        return choiceGroup5;
    }
    //</editor-fold>//GEN-END:|84-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup6 ">//GEN-BEGIN:|90-getter|0|90-preInit
    /**
     * Returns an initiliazed instance of choiceGroup6 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup6() {
        if (choiceGroup6 == null) {//GEN-END:|90-getter|0|90-preInit
            // write pre-init user code here
            choiceGroup6 = new ChoiceGroup("07. Feeling worthless or inadequate", Choice.EXCLUSIVE);//GEN-BEGIN:|90-getter|1|90-postInit
            choiceGroup6.append("Not At All", null);
            choiceGroup6.append("Somewhat", null);
            choiceGroup6.append("Moderately", null);
            choiceGroup6.append("A Lot", null);
            choiceGroup6.append("Exteremely", null);
            choiceGroup6.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup6.setFont(0, null);
            choiceGroup6.setFont(1, null);
            choiceGroup6.setFont(2, null);
            choiceGroup6.setFont(3, null);
            choiceGroup6.setFont(4, null);//GEN-END:|90-getter|1|90-postInit
            // write post-init user code here
        }//GEN-BEGIN:|90-getter|2|
        return choiceGroup6;
    }
    //</editor-fold>//GEN-END:|90-getter|2|

    //<editor-fold defaultstate="collapsed" desc=" Generated Getter: choiceGroup7 ">//GEN-BEGIN:|96-getter|0|96-preInit
    /**
     * Returns an initiliazed instance of choiceGroup7 component.
     * @return the initialized component instance
     */
    public ChoiceGroup getChoiceGroup7() {
        if (choiceGroup7 == null) {//GEN-END:|96-getter|0|96-preInit
            // write pre-init user code here
            choiceGroup7 = new ChoiceGroup("08. Guilt or shame", Choice.EXCLUSIVE);//GEN-BEGIN:|96-getter|1|96-postInit
            choiceGroup7.append("Not At All", null);
            choiceGroup7.append("Somewhat", null);
            choiceGroup7.append("Moderately", null);
            choiceGroup7.append("A Lot", null);
            choiceGroup7.append("Exteremely", null);
            choiceGroup7.setSelectedFlags(new boolean[] { false, false, false, false, false });
            choiceGroup7.setFont(0, null);
            choiceGroup7.setFont(1, null);
            choiceGroup7.setFont(2, null);
            choiceGroup7.setFont(3, null);
            choiceGroup7.setFont(4, null);//GEN-END:|96-getter|1|96-postInit
            // write post-init user code here
        }//GEN-BEGIN:|96-getter|2|
        return choiceGroup7;
    }
    //</editor-fold>//GEN-END:|96-getter|2|

    /**
     * Returns a display instance.
     * @return the display instance.
     */
    public Display getDisplay () {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable (null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started.
     * Checks whether the MIDlet have been already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet ();
        } else {
            initialize ();
            startMIDlet ();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     * @param unconditional if true, then the MIDlet has to be unconditionally terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }

}
