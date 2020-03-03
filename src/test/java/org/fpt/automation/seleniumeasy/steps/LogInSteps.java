package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.LoginPage;

public class LogInSteps {

    LoginPage onLogInPage;

    @Step
    public void logIn(){
        onLogInPage.inputEmail(onLogInPage.getEmailFromConfigFile());
        onLogInPage.clickNextButton();
        try {
            Thread.sleep(9009);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onLogInPage.inputPassword(onLogInPage.getEmailFromConfigFile());
        onLogInPage.clickNextButton();

    }

}
