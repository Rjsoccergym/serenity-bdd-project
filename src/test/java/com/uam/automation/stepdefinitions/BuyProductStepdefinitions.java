package com.uam.automation.stepdefinitions;

import com.uam.automation.questions.GetText;
import com.uam.automation.tasks.*;

import com.uam.automation.ui.PaymentMethodStore;
import com.uam.automation.ui.ProductStore;
import com.uam.automation.ui.ShippingAddressStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;


public class BuyProductStepdefinitions {

    @Given("{actor} want to buy a product on Luma Online Store")
    public void navigatingOnInternet(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.thePageStore()
        );
        actor.attemptsTo(
                LogIn.with(),
                SearchProduct.with()
        );

    }
    @When("{actor} add the product on a shopping cart")
    public void submitsForm(Actor actor) {
        actor.attemptsTo(
                AddProduct.with(new ProductStore()),
                FillOutTheNewAddresForm.with(new ShippingAddressStore())
        );
    }
    @Then("{actor} can to make checkout process and ending your buy")
    public void shouldSeeFormSubmitted(Actor actor) {
        actor.attemptsTo(
                FinalizingPurchase.with()
        );
        actor.should(
                seeThat("Thank you for your purchase!",
                        GetText.fromTarget(PaymentMethodStore.THANK_YOU_TEXT),
                        containsString("Thank you for your purchase!")
                )
        );
    }
}
