package com.uam.automation.stepdefinitions;

import com.uam.automation.tasks.AddProduct;
import com.uam.automation.tasks.LogIn;
import com.uam.automation.tasks.NavigateTo;

import com.uam.automation.tasks.SearchProduct;
import com.uam.automation.ui.ProductStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.Actor;


public class BuyProductStepdefinitions {

    @Given("{actor} want to buy a product on Luma Online Store")
    public void navigatingOnInternet(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.thePageStore()
        );
        actor.attemptsTo(
                LogIn.with(),
                SearchProduct.with(),
                AddProduct.with(new ProductStore())
        );

    }
    @When("{actor} add the product on a shopping cart")
    public void submitsForm(Actor actor) {
        actor.attemptsTo(
                //SubmitForm.with()
        );
    }
    @Then("{actor} can to make checkout process and ending your buy")
    public void shouldSeeFormSubmitted(Actor actor) {
//        actor.should(
//                seeThat("the buy was done successfully",
//                        GetText.fromTarget(ALERT), containsString("The form was successfully submitted!"))
//        );
    }
}
