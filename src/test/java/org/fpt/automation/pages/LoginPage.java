package org.fpt.automation.pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final String INPUT_TYPE_EMAIL = "//input[@type='email']";

    public  void inputEmail(String emailAdresss){
        element(INPUT_TYPE_EMAIL).type(emailAdresss);
    }
    public  void inputPassword(String password){
        element(INPUT_TYPE_EMAIL).type(password);
    }
}
