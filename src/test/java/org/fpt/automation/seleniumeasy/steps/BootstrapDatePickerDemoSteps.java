package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.BootstrapDatePickerDemoPage;

public class BootstrapDatePickerDemoSteps {
    BootstrapDatePickerDemoPage bootstrapDatePickerDemoPage;

    @Step
    public void enterDate(String form, String to){
        bootstrapDatePickerDemoPage.enterDateToDateTimePickerExample(form);
        bootstrapDatePickerDemoPage.enterDateToDateTimePickerRangeExample(to);
    }
}
