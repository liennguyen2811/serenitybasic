package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.SimpleFormDemoPage;

public class SimpleFormDemoSteps {

    SimpleFormDemoPage simpleFormDemoPage;

    @Step
    public void typeText(){
        simpleFormDemoPage.enterTextTo("Lien Nguyen");
    }
}
