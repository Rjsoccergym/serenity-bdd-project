package com.uam.automation.stepdefinitions;

import com.uam.automation.questions.GetText;

import com.uam.automation.tasks.LogIn;
import com.uam.automation.tasks.NavigateTo;

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
                LogIn.with()
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
