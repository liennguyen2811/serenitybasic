package org.fpt.automation.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fpt.automation.steps.serenity.HomeSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenOpenTheWeb {
    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps lien;

    @Test
    public void openApplication(){
        lien.launchApplication();
    }
}
