package com.uam.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ShippingAddressStore extends PageObject {
    public static Target NEW_ADDRESS_BUTTON = Target.the("New Address Button")
            .locatedBy("//div[contains(@class,\"new-address-popup\")]//button");

    public static Target FIRST_NAME_INPUT = Target.the("First Name Input")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[1]");

    public static Target LAST_NAME_INPUT = Target.the("Last Name Input")
           .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[2]");

    public static Target COMPANY_NAME_INPUT = Target.the("Company Name Input")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[3]");
    public static Target STREET_ADDRESS_INPUTS = Target.the("Street Address Input")
            .locatedBy("//fieldset[contains(@class,\"street\")]//div[contains(@class,\"control\")]//div//input");
    public static Target CITY_NAME_INPUT = Target.the("City Name Input")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[7]");
    public static Target STATE_PROVINCE_SELECT = Target.the("State/Province Select")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//select)[1]");
    public static Target COUNTRY_SELECT = Target.the("Country Select")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//select)[2]");
    public static Target POSTAL_CODE_INPUT = Target.the("Zip/Postal Code")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[9]");
    public static Target PHONE_NUMBER_INPUT = Target.the("Phone Number Input")
            .locatedBy("(//div[contains(@id,\"shipping-new-address-form\")]//input)[10]");
    public static Target SAVE_ADDRESS_CHECKBOX = Target.the("Save Address Checkbox")
           .located(By.id("shipping-save-in-address-book"));
    public static Target SHIP_HERE_BUTTON = Target.the("Ship Here Button")
            .locatedBy("//button[contains(@class,\"action-save-address\")]");
    public static Target NEXT_BUTTON = Target.the("Next Button")
            .locatedBy("//div[contains(@id,\"shipping-method-buttons-container\")]//button[contains(@class,\"continue\")]");


    public List<WebElementFacade> getAddressInputs() {
        // Utiliza el método de la página para obtener los elementos
        return findAll(STREET_ADDRESS_INPUTS.getCssOrXPathSelector());
    }
}



