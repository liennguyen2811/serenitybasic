package org.fpt.automation.seleniumeasy.pages;

import net.serenitybdd.core.pages.PageObject;
import org.fpt.automation.seleniumeasy.models.Account;


public class HomePage extends PageObject {
    public static final String INPUT_FORM_BUTTON = "//li[@class='dropdown']/a[contains(text(),'Input Forms')]";
    public static final String SIMPLE_FORM_DEMO_BUTTON = "//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]";
    public static final String DATE_PICKER_BUTTON = "//a[text()='Date pickers']";
    public static final String BOOTRAP_DATE_PICKER_BUTTON = "//a[text()='Date pickers']/preceding-sibling::i/following-sibling::ul//a[text()='Bootstrap Date Picker']";

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
}
