package org.fpt.automation.seleniumeasy.pages;

import org.fpt.automation.MyPageObject;
import org.fpt.automation.seleniumeasy.models.Account;


public class HomePage extends MyPageObject {
    public static final String INPUT_FORM_BUTTON = "//li[@class='dropdown']/a[contains(text(),'Input Forms')]";
    public static final String SIMPLE_FORM_DEMO_BUTTON = "//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]";
    public static final String DATE_PICKER_BUTTON = "//a[text()='Date pickers']";
    public static final String BOOTRAP_DATE_PICKER_BUTTON = "//a[text()='Date pickers']/preceding-sibling::i/following-sibling::ul//a[text()='Bootstrap Date Picker']";
    public static final String ALERTS_MODALS= "//a[text()='Alerts & Modals']";
    public static final String JAVASCRIPT_ALERTS = "//a[text()='Alerts & Modals']/parent::li//a[text()='Javascript Alerts']";
    Account account = new Account("lien nguyen","liennguyen2811","009","jjj");

    public void getFullNameAccount() {
        System.out.println(account.getFullName());
    }
    public void goInputForm(){
        element(INPUT_FORM_BUTTON).waitUntilPresent();
        element(INPUT_FORM_BUTTON).click();
    }
    public void goSimpleFormDemo(){
        element(SIMPLE_FORM_DEMO_BUTTON).waitUntilPresent();
        element(SIMPLE_FORM_DEMO_BUTTON).click();
    }
    public void goDatePicker(){
        element(DATE_PICKER_BUTTON).waitUntilPresent();
        element(DATE_PICKER_BUTTON).click();
    }
    public void goBootstrapDatePicker(){
        element(BOOTRAP_DATE_PICKER_BUTTON).waitUntilPresent();
        element(BOOTRAP_DATE_PICKER_BUTTON).click();
    }
    public void goAlertsModals(){
        element(ALERTS_MODALS).waitUntilPresent();
        element(ALERTS_MODALS).click();
        element(JAVASCRIPT_ALERTS).waitUntilPresent();
        element(JAVASCRIPT_ALERTS).click();
    }
}
