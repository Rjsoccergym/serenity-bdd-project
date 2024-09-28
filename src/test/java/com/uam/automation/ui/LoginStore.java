package com.uam.automation.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/customer/account/login")

public class LoginStore extends PageObject{
    public static Target EMAIL = Target.the("Email").located(By.id("email"));
    public static Target PASSWORD = Target.the("Password").located(By.id("pass"));
    public static Target SIGN_IN_BUTTON = Target.the("Sign In").located(By.id("send2"));
}
