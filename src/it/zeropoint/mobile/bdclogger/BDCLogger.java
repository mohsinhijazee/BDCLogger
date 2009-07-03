/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.zeropoint.mobile.bdclogger;

import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.ChoiceGroup;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.midlet.*;

/**
 * @author mohsinhijazee
 */
public class BDCLogger extends MIDlet implements CommandListener{
    private Form form;
    private ChoiceGroup[] questions;
    private Command exitCommand;
    private Command calculateCommand;
    
    
    
    public void startApp() {
        Display.getDisplay(this).setCurrent(getForm());

    }

    public void pauseApp() {
    }

    public void destroyApp(boolean unconditional) {
    }

    /**
     * @return the form
     */
    protected Form getForm() {
        if(form == null){
            form = new Form("Burns Depression Checklist", getQuestions());
            form.addCommand(getExitCommand());
            form.addCommand(getCalculateCommand());
            form.setCommandListener(this);
        }
        return form;
    }

    /**
     * @return the questions
     */
    protected ChoiceGroup[] getQuestions() {
        if(questions == null){
            questions = new ChoiceGroup[]{

                /*
                 *  ========================== Thoughts and Feelings
                 */


                new ChoiceGroup("01. Feeling sad or down in the dumps",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("02. Feelilng unhappy or blue",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("03. Crying spells or tearfulness",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("04. Feeling discouraged",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("05. Feeling hopeless",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("06. Low self-esteem",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("07. Feeling worthless or inadequate",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("08. Guilt or shame",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("09. Criticizing yourself or blaming yourself",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("10. Difficulty making decisions",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                /*
                 *  ========================== Activities and Personal Relationships
                 */

               new ChoiceGroup("11. Loss of interest in family, friends or colleagues",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("12. Loneliness",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("13. Spending less time with family or friends",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("14. Loss of motivation",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("15. Loss of interest in work or other activities",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("17. Loss of pleasure or satisfaction in life",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                /*
                 *  ========================== Pyhsical Symptoms
                 */

               new ChoiceGroup("18. Feellign tired",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("19. Difficulty sleeping or sleeping too much",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                new ChoiceGroup("20. Decreased or increased appetite",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("21. Loss of interest in sex",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("22. Loss of pleasure or satisfaction in life",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

                /*
                 *  ========================== Sucidal urges
                 */

               new ChoiceGroup("23. Do you have any sucidal thoughts?",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("24. Would you like to end your life?",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null),

               new ChoiceGroup("25. Do you have a plan for harming yourself?",
                        ChoiceGroup.EXCLUSIVE,
                        new String[]{"Not At All", "Somewhat", "Moderately", "A Lot", "Extremely"}, null)
                
            };
        }
        return questions;

        
    }

    /**
     * @return the exitCommand
     */
    protected Command getExitCommand() {
        if(exitCommand == null){
            exitCommand = new Command("Exit", Command.EXIT, 1);
        }
        return exitCommand;
    }

    /**
     * @return the calculateCommand
     */
    protected Command getCalculateCommand() {
        if(calculateCommand == null){
            calculateCommand = new Command("Calculate", Command.SCREEN, 0);
        }
        return calculateCommand;
    }

    protected String calculateScore(){

        int score = 0;
        String level = "";
        String result = "";

        for(int i = 0; i < questions.length; i++)
            score += questions[i].getSelectedIndex();

        
         /*
         * Level of depression
         0-5 no dpression
         * 6-10 normal but unhappy
         * 11-25 mild depression
         * 26-50 moderate depression
         * 51-75 severe depression
         * 76-100 extreme depression
         */

        if(score >= 0 && score <= 5)
            level = "No depression";

        if(score >= 6 && score <= 10)
            level = "Normal but unhappy";

        if(score >= 11 && score <= 25)
            level = "Mild depression";

        if(score >= 26 && score <= 50)
            level = "Moderate depression";

        if(score >= 51 && score <= 75)
            level = "Severe depression";

        if(score >= 76 && score <= 100)
            level = "Extreme depression";

        result = score + " " + level;
        return result;
    }

    public void commandAction(Command c, Displayable d) {

        if(c == getExitCommand())
            notifyDestroyed();

        if(c == getCalculateCommand()){
            String result = calculateScore();
            Alert a = new Alert("Result", result, null, AlertType.INFO);
            Display.getDisplay(this).setCurrent(a);
            a = null;
        }
    }
}
