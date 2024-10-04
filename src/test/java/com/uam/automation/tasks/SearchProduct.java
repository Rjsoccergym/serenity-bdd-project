package com.uam.automation.tasks;

import com.uam.automation.ui.HomeStore;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static com.uam.automation.ui.HomeStore.*;

public class SearchProduct implements Task {
    @Override
    @Step("{0} Search a product")
    public <T extends Actor> void performAs(T actor) {
        HomeStore home = new HomeStore();
        actor.attemptsTo(
                Enter.theValue("pants").into(SEARCH_FIELD),
                Click.on(SEARCH_BUTTON) // validar si con click en el boton o enteR
        );
        home.MakeHover(FIRST_PRODUCT);
    }
    public static SearchProduct with() {
        //return Instrumented.instanceOf(SearchProducts.class).withProperties();
        return new SearchProduct();
    }
}
