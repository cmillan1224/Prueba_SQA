package co.sqasa.interactions;

import co.sqasa.ui.ProdcutPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Add extends PageObject implements Interaction {
    public static Add toCart() {
        return Tasks.instrumented(Add.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        waitFor(5).seconds();
        actor.attemptsTo(Click.on(ProdcutPage.ADD_TO_CART));
    }
}
