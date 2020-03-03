package org.fpt.automation.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fpt.automation.steps.serenity.HomeSteps;
import org.fpt.automation.steps.serenity.LogInSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenLoginApplication {
    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps startWeb;

    @Steps
    LogInSteps loginGoogleAPI;

    @Test
    public void loginApplication(){
        startWeb.launchApplication();
        loginGoogleAPI.logIn();
    }
    @Test
    public void getName(){
        startWeb.getNameAccount();
    }

//    @Test
//    public void lien(){
//        String text = "Tiếp theo";
//    }

}

