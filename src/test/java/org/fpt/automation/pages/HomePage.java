package org.fpt.automation.pages;

import net.serenitybdd.core.pages.PageObject;
import org.fpt.automation.feature.properties.Account;


public class HomePage extends PageObject {
     Account account = new Account("lien nguyen","liennguyen2811","009","jjj");

    public void getFullNameAccount() {
        System.out.println(account.getFullName());
    }
}
