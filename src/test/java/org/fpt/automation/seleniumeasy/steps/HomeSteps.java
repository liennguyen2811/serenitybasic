package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.HomePage;

public class HomeSteps {
    HomePage onHomePage;

    @Step
    public void launchApplication(){
        onHomePage.open();
    }
    @Step
    public void goToInputForm(){
        onHomePage.goInputForm();
    }
    @Step
    public void goDatePicker(){
        onHomePage.goDatePicker();
    }
    @Step
    public void goBootstrapDatePicker(){
        onHomePage.goBootstrapDatePicker();
    }
    @Step
    public void goToSimpleFormDemo(){
        onHomePage.goSimpleFormDemo();
    }

    @Step
    public void getNameAccount(){
        onHomePage.getFullNameAccount();
    }
}
