package org.fpt.automation.pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {

    public static final String INPUT_TYPE_TARGET = "//input[@type='%s']";
    public static final String  NEXT_BUTTON = "//span[text()='%s']";

    public static final String PASSWORD ="password";
    public static final String EMAIL ="email";


    public  void inputEmail(String emailAdresss){
        element(Target.of(EMAIL)).type(emailAdresss);
    }
    public  void inputPassword(String password){
        element(Target.of(PASSWORD)).type(password);
    }
    public  void clickNextButton(){
       String xpath = String.format(NEXT_BUTTON,Label.NEXT.getText());
        element(xpath).click();
        System.out.println(xpath);
    }
    static class Target{
        public static String of(String lable){
           return String.format(INPUT_TYPE_TARGET,lable);
        }
    }
    public enum Label {
        LOGIN("Log-in", "Đăng nhập"),
        LOGOUT("Log-out", "Đăng xuất"),
        NEXT("Next", "Tiếp theo");

        private String english;
        private String vietnamese;

        Label(String english, String vietnamese) {
            this.english = english;
            this.vietnamese = vietnamese;
        }

        public String getText() {
//            String isEnglish = "VIE";//Langue.isEnglish
            String isEnglish = System.getProperty("LANG"); // WHen run them -DLANG=VIE
            System.out.println(isEnglish);
            if (isEnglish.equals("VIE")) {
                return String.valueOf(vietnamese);
            } else {
                return String.valueOf(english);
            }
        }
    }
}
