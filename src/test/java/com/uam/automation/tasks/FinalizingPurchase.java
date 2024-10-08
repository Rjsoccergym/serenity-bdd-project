package com.uam.automation.tasks;


import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.uam.automation.ui.PaymentMethodStore.*;
import static com.uam.automation.ui.ShippingAddressStore.*;



public class FinalizingPurchase implements Task {

    @Override
    @Step("{0} Finalizing the purchase")
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(NEXT_BUTTON),
                Click.on(PLACE_ORDER_BUTTON)
        );

    }

    public static FinalizingPurchase with(){
        return new FinalizingPurchase();
    }
}
