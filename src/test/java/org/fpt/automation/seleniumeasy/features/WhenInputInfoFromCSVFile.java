package org.fpt.automation.seleniumeasy.features;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.fpt.automation.seleniumeasy.steps.BootstrapDatePickerDemoSteps;
import org.fpt.automation.seleniumeasy.steps.HomeSteps;
import org.fpt.automation.seleniumeasy.steps.SimpleFormDemoSteps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@UseTestDataFrom("testdata/lession27.csv")
@RunWith(SerenityParameterizedRunner.class)
@WithTag("parallel")
public class WhenInputInfoFromCSVFile {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    @Managed
    WebDriver webdriver;

    @Steps
    HomeSteps homeSteps;

    @Steps
    SimpleFormDemoSteps simpleFormDemoSteps;

    @Steps
    BootstrapDatePickerDemoSteps bootstrapDatePickerDemoSteps;

    @Test
    public void typeText(){
        homeSteps.launchApplication();
        homeSteps.goToInputForm();
        homeSteps.goToSimpleFormDemo();
        simpleFormDemoSteps.typeTextToSimpleFormCSVFile(name);
    }
}
