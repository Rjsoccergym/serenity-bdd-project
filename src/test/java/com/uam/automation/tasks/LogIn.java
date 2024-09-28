package com.uam.automation.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.annotations.Step;
import static com.uam.automation.ui.PageStore.*;

public class LogIn implements Task {

    @Override
    @Step("{0} click to link sign in")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SIGN_IN));
    }
    public static LogIn with() {
        return
                Instrumented.instanceOf(LogIn.class).withProperties();
    }
}