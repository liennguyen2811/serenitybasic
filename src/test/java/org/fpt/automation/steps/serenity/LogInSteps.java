package org.fpt.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.pages.LoginPage;

public class LogInSteps {

    LoginPage onLogInPage;

    @Step
    public void logIn(){
        onLogInPage.inputEmail("liennguyen2811@gmail.com");
        onLogInPage.clickNextButton();
        try {
            Thread.sleep(9009);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        onLogInPage.inputPassword("jjj");
        onLogInPage.clickNextButton();

    }

}
