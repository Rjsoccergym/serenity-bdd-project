package com.uam.automation.ui;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://magento.softwaretestingboard.com/")

public class PageStore extends PageObject{
    public static Target SIGN_IN = Target.the("Sign In").
            locatedBy("(//a[contains(text(),'Sign In')])[1]");

}
