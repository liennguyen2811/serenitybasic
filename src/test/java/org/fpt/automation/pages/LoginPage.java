package org.fpt.automation.pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final String INPUT_TYPE_TARGET = "//input[@type='%s']";
    public static final String  NEXT_BUTTON = "//span[text()='Tiếp theo']";

    public static final String PASSWORD ="password";
    public static final String EMAIL ="email";


    public  void inputEmail(String emailAdresss){
        element(Target.of(EMAIL)).type(emailAdresss);
    }
    public  void inputPassword(String password){
        element(Target.of(PASSWORD)).type(password);
    }
    public  void clickNextButton(){
        element(NEXT_BUTTON).click();
    }
    static class Target{
        public static String of(String lable){
           return String.format(INPUT_TYPE_TARGET,lable);
        }
    }
}
