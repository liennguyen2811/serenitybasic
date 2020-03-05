package org.fpt.automation.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;

import static org.fpt.automation.seleniumeasy.models.Common.target;

public class SimpleFormDemoPage extends PageObject {
    public static final String ENTER_TEXT_TARGET = "//label[text()='%s']/following-sibling::input[@type='text']";

    public void enterTextToSimpleForm(String textToType){
        element(target("Enter message",ENTER_TEXT_TARGET)).type(textToType);
        element(target("Enter a",ENTER_TEXT_TARGET)).type(textToType);
        element(target("Enter b",ENTER_TEXT_TARGET)).type(textToType);
    }
    public void enterTextToSimpleFormCSVFile(String textToType){
        String locator = target("Enter message",ENTER_TEXT_TARGET);
        element(locator).type(textToType);
    }
}
