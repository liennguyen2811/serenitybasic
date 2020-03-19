package org.fpt.automation.seleniumeasy.pages;

import org.fpt.automation.MyPageObject;

import static org.fpt.automation.seleniumeasy.models.Common.target;

public class SimpleFormDemoPage extends MyPageObject {
    public static final String ENTER_TEXT_TARGET = "//label[text()='%s']/following-sibling::input[@type='text']";
    public static final String TOTAL_BUTTON = "//button[text()='Get Total']";
    public static final String TOTAL_LABEL_BUTTON = "//label[text()=' Total a + b = ']";

    public void enterTextToSimpleForm(String textToType){
        String locator = target("Enter message",ENTER_TEXT_TARGET);
        scrollTo(element(locator));
        element(target("Enter message",ENTER_TEXT_TARGET)).type(textToType);
        String locator1 = target("Enter a",ENTER_TEXT_TARGET);
        scrollTo(element(locator1));
        element(target("Enter a",ENTER_TEXT_TARGET)).type(textToType);
        element(target("Enter b",ENTER_TEXT_TARGET)).type(textToType);
        highlightElement(element(TOTAL_BUTTON));
        sleepInSecond(10);
        highlightElement(element(TOTAL_LABEL_BUTTON));
        sleepInSecond(10);
        jSClickOn(element(TOTAL_BUTTON));
    }
    public void enterTextToSimpleFormCSVFile(String textToType){
        String locator = target("Enter message",ENTER_TEXT_TARGET);
        element(locator).type(textToType);
    }
}
