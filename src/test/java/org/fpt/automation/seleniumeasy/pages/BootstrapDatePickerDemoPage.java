package org.fpt.automation.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;

public class BootstrapDatePickerDemoPage extends PageObject {
    public static final String ENTER_DATE_TARGET = "//div[text()='%s']/parent::div//input";

    public String target(String target){
        return String.format(ENTER_DATE_TARGET,target);
    }
    public void enterDateExample(String date){
        String locator = target("Date Example :");
        element(locator).waitUntilPresent();
        element(locator).click();
        element(locator).type(date);
    }
    public void enterDateRangeExample(String date){
        String locator = target("Date Range Example :");
        element(locator).waitUntilPresent();
        element(locator).click();
        element(locator).type(date);
    }
}
