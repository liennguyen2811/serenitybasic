package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.BootstrapDatePickerDemoPage;

public class BootstrapDatePickerDemoSteps {
    BootstrapDatePickerDemoPage bootstrapDatePickerDemoPage;

    @Step
    public void enterDate(){
        bootstrapDatePickerDemoPage.enterDateExample("03-03-2020");
        bootstrapDatePickerDemoPage.enterDateRangeExample("04-04-2020");
    }
}
