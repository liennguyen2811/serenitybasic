package org.fpt.automation.seleniumeasy.models;

import org.apache.commons.lang3.RandomStringUtils;

public class Account {
    private String fullName;
    private String email;
    private String phone;
    private String password;

    public String getFullName() {
        return this.fullName;
    }

    public void setPassword(String rePassword) {
        this.fullName = this.password;
    }

    public Account(String fullName, String email, String phone, String password) {
        this.fullName = fullName;
        this.email = String.format("%s_%s", email, RandomStringUtils.randomAlphabetic(20));
        this.password = password;
        this.phone = phone;
    }

}
