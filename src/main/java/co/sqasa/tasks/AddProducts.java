package co.sqasa.tasks;

import co.sqasa.interactions.Add;
import co.sqasa.interactions.Select;
import co.sqasa.interactions.Write;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.core.pages.PageObject;

public class AddProducts extends PageObject implements Task {

    public static AddProducts toCart() {
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Select.products(),
                Add.toCart(),
                Write.amount());
    }
}
