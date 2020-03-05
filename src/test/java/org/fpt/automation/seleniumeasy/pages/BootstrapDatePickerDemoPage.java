package org.fpt.automation.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;

import static org.fpt.automation.seleniumeasy.models.Common.target;


public class BootstrapDatePickerDemoPage extends PageObject {
    public static final String ENTER_DATE_TARGET = "//div[text()='%s']/parent::div//input";


    public void enterDateToDateTimePickerExample(String date){

        String locator = target("Date Example :",ENTER_DATE_TARGET);
        element(locator).waitUntilPresent();
        element(locator).click();
        element(locator).type(date);
    }
    public void enterDateToDateTimePickerRangeExample(String date){
        String locator = target("Date Range Example :",ENTER_DATE_TARGET);
        element(locator).waitUntilPresent();
        element(locator).click();
        element(locator).type(date);
    }
}
