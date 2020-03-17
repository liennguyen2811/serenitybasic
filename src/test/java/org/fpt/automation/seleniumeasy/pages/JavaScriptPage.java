package org.fpt.automation.seleniumeasy.pages;

import org.fpt.automation.MyPageObject;

public class JavaScriptPage extends MyPageObject {
    public static final String JAVASCRIPT_ALERT_BOX = "//p[text()='Click the button to display an alert box:']/following-sibling::button";
    public static final String JAVASCRIPT_CONFIRM_BOX = "//p[text()='When a confirm box pops up, user can click \"OK\" or \"Cancel\" to proceed.']/following-sibling::button";
    public static final String JAVASCRIPT_PROMPT_BOX = "//p[text()='When a prompt box pops up, user can click \"OK\" or \"Cancel\" to proceed']/following-sibling::button";

    public void acceptAlert(){
        element(JAVASCRIPT_ALERT_BOX).waitUntilPresent();
        element(JAVASCRIPT_ALERT_BOX).click();
        getAlert().accept();
    }
    public void select_OK_Cancel_Alert(String buttonName){
        element(JAVASCRIPT_CONFIRM_BOX).waitUntilPresent();
        element(JAVASCRIPT_CONFIRM_BOX).click();
        sleepInSecond(2);
        if(buttonName.equals("Cancel")){
        getAlert().dismiss();}
        else getAlert().accept();
    }
    public void sendKey_Prompt_Box(String textToSend, String buttonName){
        element(JAVASCRIPT_PROMPT_BOX).waitUntilPresent();
        element(JAVASCRIPT_PROMPT_BOX).click();
        sleepInSecond(10);
        getAlert().sendKeys(textToSend);
        if(buttonName.equals("Cancel")){
            sleepInSecond(5);
            getAlert().dismiss();}
        else {
            sleepInSecond(5);
            getAlert().accept();}
    }
}
