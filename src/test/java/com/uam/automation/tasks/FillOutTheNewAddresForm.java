package com.uam.automation.tasks;

import com.uam.automation.ui.ProductStore;
import com.uam.automation.ui.ShippingAddressStore;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.uam.automation.ui.ShippingAddressStore.*;


public class FillOutTheNewAddresForm implements Task {
    private final ShippingAddressStore shippingAddressStore;

    public FillOutTheNewAddresForm(ShippingAddressStore shippingAddressStore) {
        this.shippingAddressStore = shippingAddressStore;
    }


    @Override
    @Step("{0} Fill Out The Shipping Address form")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NEW_ADDRESS_BUTTON),
                Enter.theValue("").into(FIRST_NAME_INPUT),
                Enter.theValue("Los").into(FIRST_NAME_INPUT),
                Enter.theValue("").into(LAST_NAME_INPUT),
                Enter.theValue("Morochos").into(LAST_NAME_INPUT),
                Enter.theValue("Universidad Autonoma De Manizales").into(COMPANY_NAME_INPUT)
        );
        List<WebElementFacade> AddressInputs = shippingAddressStore.getAddressInputs();
        actor.attemptsTo(
                Enter.theValue("Antigua Estación del Ferrocarril").into(AddressInputs.get(0)),
                Enter.theValue("Manizales").into(AddressInputs.get(1)),
                Enter.theValue("Caldas").into(AddressInputs.get(2)),
                Enter.theValue("Manizales").into(CITY_NAME_INPUT),
                SelectFromOptions.byVisibleText("Colombia").from(COUNTRY_SELECT),
                SelectFromOptions.byVisibleText("Caldas").from(STATE_PROVINCE_SELECT),
                Enter.theValue("170001").into(POSTAL_CODE_INPUT),
                Enter.theValue("3121238395").into(PHONE_NUMBER_INPUT),
                Click.on(SAVE_ADDRESS_CHECKBOX),
                Click.on(SHIP_HERE_BUTTON)
        );
    }
    public static FillOutTheNewAddresForm with(ShippingAddressStore shippingAddressStore) {
        //return Instrumented.instanceOf(SearchProducts.class).withProperties();
        return new FillOutTheNewAddresForm(shippingAddressStore);
    }
}
