package org.fpt.automation.seleniumeasy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.fpt.automation.seleniumeasy.steps.HomeSteps;
import org.fpt.automation.seleniumeasy.steps.JavaScriptSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@WithTag("javascript")
public class WhenCutPastText {
    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    JavaScriptSteps javaScriptSteps;

    @Test
    public void checkPopupJavaScript(){
        homeSteps.launchApplication();
        homeSteps.cutPastTextFromSearch();
    }
}
