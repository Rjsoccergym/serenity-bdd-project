package com.uam.automation.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomeStore extends PageObject {
    public static Target SEARCH_FIELD = Target.the("Search").located(By.id("search"));
    public static Target SEARCH_BUTTON = Target.the("Search Button")
            .locatedBy("//*[@id=\"search_mini_form\"]/div[2]/button");
    public static Target FIRST_PRODUCT = Target.the("First Producto")
            .locatedBy("(//div[contains(@class,\"products-grid\")]//div[contains(@class,\"product-item-info\")])[1]");

    public void MakeHover(Target targetElement){
        WebElement element = targetElement.resolveFor(getDriver());
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element).click().perform();
    }
}
