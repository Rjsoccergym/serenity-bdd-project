package com.uam.automation.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class PaymentMethodStore extends PageObject {
    public static Target PLACE_ORDER_BUTTON = Target.the("New Address Button")
            .locatedBy("//button[span[contains(text(),\"Place Order\")]]");
    public static Target THANK_YOU_TEXT = Target.the("Thank you text")
            .locatedBy("//span[contains(text(),\"Thank you for your purchase!\")]");
}
