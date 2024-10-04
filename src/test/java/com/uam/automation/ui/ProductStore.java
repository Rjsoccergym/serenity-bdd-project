package com.uam.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ProductStore extends PageObject {
    public static Target SIZES = Target.the("First Product")
            .locatedBy("(//div[contains(@class,\"swatch-attribute-options\")])[1]//div");
    public static Target COLORS = Target.the("First Product")
            .locatedBy("(//div[contains(@class,\"swatch-attribute-options\")])[2]//div");
    public static Target QUANTITY_FIELD = Target.the("Quantity Input")
            .located(By.id("qty"));
    public static Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .located(By.id("product-addtocart-button"));
    public static Target SHOPPING_CART_BUTTON = Target.the("Shopping cart button")
            .locatedBy("//div[contains(@class,\"minicart-wrapper\")]//a[contains(@class,\"showcart\")]");
    public static Target PROCEED_CHECKOUT_BUTTON = Target.the("Proceed to checkout button")
            .located(By.id("top-cart-btn-checkout"));

    public List<WebElementFacade> getSizes() {
        // Utiliza el método de la página para obtener los elementos
        return findAll(SIZES.getCssOrXPathSelector());
    }

    public List<WebElementFacade> getColors() {
        // Utiliza el método de la página para obtener los elementos
        return findAll(COLORS.getCssOrXPathSelector());
    }
}
