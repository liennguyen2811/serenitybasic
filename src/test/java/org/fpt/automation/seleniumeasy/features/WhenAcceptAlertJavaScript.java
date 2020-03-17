package org.fpt.automation.seleniumeasy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fpt.automation.seleniumeasy.steps.HomeSteps;
import org.fpt.automation.seleniumeasy.steps.JavaScriptSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenAcceptAlertJavaScript {
    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    JavaScriptSteps javaScriptSteps;

    @Test
    public void checkPopupJavaScript(){
        homeSteps.launchApplication();
        homeSteps.goToJavaScriptAlertsModals();
        javaScriptSteps.testAcceptAlert();
    }
}
