package co.sqasa.interactions;

import co.sqasa.ui.ProdcutPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.sqasa.ui.MainPage.FIRST_PRODUCT;

public class Select implements Interaction {

    public static Select products() {
        return Tasks.instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(FIRST_PRODUCT, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(FIRST_PRODUCT),
                WaitUntil.the(ProdcutPage.SECOND_PRODUCT, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(ProdcutPage.SECOND_PRODUCT),
                WaitUntil.the(ProdcutPage.SECOND_PRODUCT, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds()
        );
    }
}
