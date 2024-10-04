package com.uam.automation.tasks;

import com.uam.automation.ui.ProductStore;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Random;

import static com.uam.automation.ui.ProductStore.*;

public class AddProduct implements Task {
    private final ProductStore productStore;

    public AddProduct(ProductStore productStore) {
        this.productStore = productStore;
    }

    @Override
    @Step("{0} Add a product")
    public <T extends Actor> void performAs(T actor) {
        // Obtiene la lista de tamaños desde la capa de UI
        List<WebElementFacade> sizes = productStore.getSizes();
        if (!sizes.isEmpty()) {
            // Selecciona un tamaño aleatorio
            Random random = new Random();
            WebElementFacade randomSize = sizes.get(random.nextInt(sizes.size()));

            // Haz clic en el tamaño seleccionado
            actor.attemptsTo(
                    Click.on(randomSize)
            );
        }
        // Obtiene los colores desde la capa de UI
        List<WebElementFacade> colors = productStore.getColors();
        if (!colors.isEmpty()) {
            // Selecciona un tamaño aleatorio
            Random random = new Random();
            WebElementFacade randomColor = colors.get(random.nextInt(colors.size()));

            // Haz clic en el tamaño seleccionado
            actor.attemptsTo(
                    Click.on(randomColor)
            );
        }

        actor.attemptsTo(
                Enter.theValue("100").into(QUANTITY_FIELD),
                Click.on(ADD_TO_CART_BUTTON),
                Click.on(SHOPPING_CART_BUTTON),
                Click.on(PROCEED_CHECKOUT_BUTTON)
        );

        try {
            Thread.sleep(10000);  // 10,000 milisegundos = 10 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public static AddProduct with(ProductStore productStore) {
        return new AddProduct(productStore);
    }
}
