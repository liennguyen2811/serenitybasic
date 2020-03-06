package org.fpt.automation.seleniumeasy.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.fpt.automation.seleniumeasy.steps.BootstrapDatePickerDemoSteps;
import org.fpt.automation.seleniumeasy.steps.HomeSteps;
import org.fpt.automation.seleniumeasy.steps.SimpleFormDemoSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag ("parallel"),
        @WithTag ("class"),
        @WithTag ("paralle")
})
public class WhenTypeTextAndDate {
    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    SimpleFormDemoSteps simpleFormDemoSteps;

    @Steps
    BootstrapDatePickerDemoSteps bootstrapDatePickerDemoSteps;
    @WithTag("method")
    @Test
    public void typeText(){
        homeSteps.launchApplication();
//        homeSteps.goToInputForm();
//        homeSteps.goToSimpleFormDemo();
//        simpleFormDemoSteps.typeTextToSimpleForm("lien");
    }
    @Test
    public void typeDate(){
        homeSteps.launchApplication();
//        homeSteps.goToInputForm();
//        homeSteps.goToSimpleFormDemo();
//        homeSteps.goDatePicker();
//        homeSteps.goBootstrapDatePicker();
//        bootstrapDatePickerDemoSteps.enterDate("02-02-2020","03-03-2020");
    }
}
