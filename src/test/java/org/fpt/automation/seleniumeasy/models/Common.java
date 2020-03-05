package org.fpt.automation.seleniumeasy.models;

public class Common {

    public static String target(String target,String locator)
    {
        return String.format(locator,target);
    }
}
