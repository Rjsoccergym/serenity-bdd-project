package com.uam.automation.tasks;

import com.uam.automation.ui.LoginStore;
import com.uam.automation.ui.PageStore;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable thePageStore(){
        return Task.where("{0} opens the page store",
                Open.browserOn().the(PageStore.class));
    }

    public static Performable theLoginStore(){
        return Task.where("{0} opens the page store",
                Open.browserOn().the(LoginStore.class));
    }
}