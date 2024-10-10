package co.sqasa.interactions;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqasa.ui.CheckoutPage.*;

public class Write extends PageObject implements Interaction {
    public static Write amount() {
        return Tasks.instrumented(Write.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        waitFor(5).seconds();
        actor.attemptsTo(
                WaitUntil.the(REVIEW_ORDER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                net.serenitybdd.screenplay.actions.Enter.theValue("2").into(QUANTITY_FIRST_PRODUCT),
                net.serenitybdd.screenplay.actions.Enter.theValue("5").into(QUANTITY_SECOND_PRODUCT));

    }
}
