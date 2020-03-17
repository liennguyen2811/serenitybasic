package org.fpt.automation.seleniumeasy.steps;

import net.thucydides.core.annotations.Step;
import org.fpt.automation.seleniumeasy.pages.JavaScriptPage;

public class JavaScriptSteps {
    JavaScriptPage onJavaScriptPage;

    @Step
    public void testAcceptAlert(){
        onJavaScriptPage.acceptAlert();
        onJavaScriptPage.select_OK_Cancel_Alert("Cancel");
        onJavaScriptPage.select_OK_Cancel_Alert("OK");
        onJavaScriptPage.sendKey_Prompt_Box("LienNguyen","OK");
        onJavaScriptPage.sendKey_Prompt_Box("LienNguyen","Cancel");
    }
}
