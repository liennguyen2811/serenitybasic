package org.fpt.automation.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fpt.automation.pages.HomePage;

public class HomeSteps {
    HomePage onHomePage;

    @Step
    public void launchApplication(){
        onHomePage.open();

    }

}
