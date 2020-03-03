package org.fpt.automation.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;

public class SimpleFormDemoPage extends PageObject {
    public static final String ENTER_TEXT_TARGET = "//label[text()='%s']/following-sibling::input[@type='text']";

    public String target(String target){
            return String.format(ENTER_TEXT_TARGET,target);
        }
    public void enterTextTo(String textToType){
        element(target("Enter message")).type(textToType);
        element(target("Enter a")).type(textToType);
        element(target("Enter b")).type(textToType);

    }
}
