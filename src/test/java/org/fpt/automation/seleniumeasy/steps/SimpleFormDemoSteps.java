package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.SimpleFormDemoPage;

public class SimpleFormDemoSteps {

    SimpleFormDemoPage simpleFormDemoPage;

    @Step
    public void typeTextToSimpleForm(String name){
        simpleFormDemoPage.enterTextToSimpleForm(name);
    }
    public void typeTextToSimpleFormCSVFile(String name){
        simpleFormDemoPage.enterTextToSimpleFormCSVFile(name);
    }
}
